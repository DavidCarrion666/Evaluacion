/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author SALA I
 */
public class TrajeEscuela extends Trajes {

    private double valorChompa;
    private double valorPantalon;
    private double valorCamisa;
    private double valorCorbata;

    public TrajeEscuela( Cliente c, double b, double h, double p,
            double m, double r) {
        super( c, b);

        valorChompa = h;
        valorPantalon = p;
        valorCamisa = m;
        valorCorbata = r;
    }

    public double obtenerValorChompa() {
        return valorChompa;
    }

    public void establecerValorChompa(double v) {
        valorChompa = v;
    }

    public double obtenerValorPantalon() {
        return valorPantalon;
    }

    public void establecerValorPantalon(double v) {
        valorPantalon = v;
    }

    public double obtenerValorCamisa() {
        return valorCamisa;
    }

    public void establecerValorCamisa(double v) {
        valorCamisa = v;
    }

    public double obtenerValorCorbata() {
        return valorCorbata;
    }

    public void establecerValorCorbata(double v) {
        valorCorbata = v;
    }

    @Override
    public void establecerValorBase(double v) {
        valorBase = v;
    }

    @Override
    public void establecerCliente(Cliente c) {
        cliente = c;
    }

    @Override
    public void calcularValorFinal() {
        valorFinal = valorChompa + valorPantalon + valorCamisa + valorCorbata +
                valorBase;
    }
    
    @Override
    public String toString(){
    
        String data = String.format("""
                                    Datos Del Cliente
                                    %sValor De La Camisa: %.2f
                                    Valor De La Corbata: %.2f
                                    Valor de la chompa: %.2f
                                    Valor del Pantalon: %.2f
                                    VALOR A CANCELAR: %.2f
                                    """, 
                cliente,
                valorCamisa,
                valorCorbata,
                valorChompa,
                valorPantalon,
                valorFinal);
        
        
        return data;
    
    }

}
