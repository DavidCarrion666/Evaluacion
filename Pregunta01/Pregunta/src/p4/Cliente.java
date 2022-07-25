/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

/**
 *
 * @author reroes
 */
public class Cliente {

    private String nombre;

    public Cliente(String n) {
        nombre = n;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    @Override
    public String toString() {

        String cadena = String.format("%s", nombre);

        return cadena;

    }

}
