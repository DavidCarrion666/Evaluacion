/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author SALA I
 */
public class TrajePlaya extends Trajes {

    private double valorGorra;
    private double valorCamiseta;
    private double valorPantaloneta;

    public TrajePlaya(Cliente c, double b, double g, double m,
            double p) {
        super(c, b);

        valorGorra = g;
        valorCamiseta = m;
        valorPantaloneta = p;
    }

    public double obtenerVaorGorra() {

        if (cliente.obtenerEdad() >= 20) {
            valorGorra = valorGorra / 2;
            return valorGorra;
        }
        return valorGorra;
    }

    public void establecerVaorGorra(double v) {
        valorGorra = v;
    }

    public double obtenerValorCamiestablecera() {
        return valorCamiseta;
    }

    public void establecerValorCamiestablecera(double v) {
        valorCamiseta = v;
    }

    public double obtenerValorPantaloneta() {
        return valorPantaloneta;
    }

    public void establecerValorPantaloneta(double v) {
        valorPantaloneta = v;
    }

    @Override
    public void calcularValorFinal() {
        valorFinal = valorGorra + valorCamiseta + valorPantaloneta + valorBase;

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
    public String toString(){
    String data = String.format("""
                                Datos Del Cliente
                                %sValor Gorra: %.2f
                                Valor Camiseta: %.2f
                                Valor Pantaloneta: %.2f
                                Valor Base:%.2f
                                VALOR A CANCELAR: %.2f
                                """, 
            cliente,
            valorGorra,
            valorCamiseta,
            valorPantaloneta,
            valorBase,
            valorFinal);
    
    
    return data;
    
    }

}
