/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author SALA I
 */
public class Cliente {

    private String nombre;
    private int edad;
    private String ciudad;

    public Cliente(String n, int e, String c) {
        nombre = n;
        edad = e;
        ciudad = c;

    }

    public int obtenerEdad() {
        return edad;
    }

    public void establecerEdad(int e) {
        edad = e;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(String c) {
        ciudad = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n%s\n%d\n",
                nombre,
                ciudad,
                edad);

        return cadena;

    }
}
