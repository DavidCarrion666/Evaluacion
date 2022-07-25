/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.util.ArrayList;
import p2.Jugo;

/**
 *
 * @author reroes
 */
public class Venta {

    private Cliente cliente;
    private double valorVenta;
    private ArrayList<Jugo> lista;

    public ArrayList<Jugo> obtenerLista() {
        return lista;
    }

    public void establecerLista(ArrayList<Jugo> l) {
        lista = l;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public void establecerCliente(Cliente c) {
        cliente = c;
    }

    public void establecerValorVenta() {
        
        
        
        for (int i = 0; i < obtenerLista().size(); i++) {
            valorVenta = valorVenta + obtenerLista().get(i).obtenerVFinal();
        }

    }

    public double obtenerValorVenta() {
        return valorVenta;
    }

    @Override
    public String toString() {
        /*String data = String.format("Ventas del cliente %s\n"
                + "Jugo 1: %.3f\n"
                + "Jugo 2: %.3f\n"
                + "Jugo 3: %.3f\n"
                + "Jugo 4: %.3f\n"
                + "Jugo 5: %.3f\n"
                + "Total: %.2f\n",
                cliente,
                obtenerJugo1().obtenerVFinal(),
                obtenerJugo2().obtenerVFinal(),
                obtenerJugo3().obtenerVFinal(),
                obtenerJugo4().obtenerVFinal(),
                obtenerJugo5().obtenerVFinal(),
                obtenerValorVenta());*/
        
        String data = String.format("Ventas del cliente %s",
                cliente.obtenerNombre());
        
       /*  for (Jugo t : obtenerLista()) {
            data = String.format("%s\t\n"
                    + "\tJugo : %.2f",
                    data,
                    t.obtenerVFinal());
        }*/
       
       
        for (int i = 0; i < lista.size(); i++) {
            data = String.format("%s\n"
                    + " %s",
                    data,
                    lista.get(i));
        }
        return data;
    }

}
