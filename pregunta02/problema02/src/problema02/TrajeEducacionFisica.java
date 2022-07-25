/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author SALA I
 */
public class TrajeEducacionFisica extends Trajes {

    private double valorCalentador;
    private double valorMedias;

    public TrajeEducacionFisica(Cliente c, double b, double l,
            double m) {
        super(c, b);

        valorCalentador = l;
        valorMedias = m;

    }

    public double obtenerValorCalentador() {
        return valorCalentador;
    }

    public void establecerValorCalentador(double v) {
        valorCalentador = v;
    }

    public double obtenerValorMedias() {
        if (cliente.obtenerCiudad().equals("Zamora")
                || cliente.obtenerCiudad().equals("Machala")) {
            valorMedias = valorMedias * 80 / 100;
            return valorMedias;
        }
        return valorMedias;
    }

    public void establecerValorMedias(double v) {
        valorMedias = v;
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
        valorFinal = valorBase + valorCalentador + valorMedias;
    }

    public String toString() {
        String cadena = String.format("""
                                      Datos Del Usuario 
                                      %sValor De las medias: %.2f
                                      Valor Del Calentador: %.2f
                                      VALOR A CANCELAR: %.2f
                                      """,
                cliente,
                valorMedias,
                valorCalentador,
                valorFinal);

        return cadena;
    }

}
