/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author SALA I
 */
public abstract class Trajes {

    protected double valorFinal;
    protected Cliente cliente;
    protected double valorBase;
    
    
    public Trajes( Cliente c, double b){
    cliente = c;
    valorBase = b;
    
    }

    public double obtenerValorFinal() {
        return valorFinal;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public double obtenerValorBase() {
        return valorBase;
    }

    public abstract void establecerValorBase(double v);

    public abstract void establecerCliente(Cliente c);

    public abstract void calcularValorFinal();

}
