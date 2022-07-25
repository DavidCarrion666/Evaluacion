/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author SALA I
 */
public class TrajeFiesta extends Trajes {

    private double valorTerno;
    private double valorCamisa;
    private double valorZapatos;

    public TrajeFiesta(Cliente c, double b, double t, double m,
            double z) {
        super(c, b);
        valorTerno = t;
        valorCamisa = m;
        valorZapatos = z;
    }

    public double obtenerValorTerno() {
        return valorTerno;
    }

    public void establecerValorTerno(double v) {
        valorTerno = v;
    }

    public double obtenerValorCamisa() {
        return valorCamisa;
    }

    public void establecerValorCamisa(double v) {
        valorCamisa = v;
    }

    public double obtenerValorZapatos() {
        return valorZapatos;
    }

    public void establecerValorZapatos(double v) {
        valorZapatos = v;
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
        valorFinal = valorBase + valorCamisa + valorZapatos + valorTerno;
    }

    public String toString() {
        String cadena = String.format("""
                                      Datos Del Cliente
                                      %sValor De los zapatos: %.2f
                                      Valor De La Camisa: %.2f
                                      Valor Del Terno: %.2f
                                      VALOR A CANCELAR: %.2f
                                      """,
                cliente,
                valorZapatos,
                valorCamisa,
                valorTerno,
                valorFinal);

        return cadena;
    }
}
