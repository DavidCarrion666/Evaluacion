/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Trajes> lista = new ArrayList();
        Scanner sc = new Scanner(System.in);
        TrajePlaya p;
        TrajeFiesta f;
        TrajeEscuela l;
        TrajeEducacionFisica e;
        Cliente c;
        int opcion;

        System.out.println("A Continuacion Se van a Crear Los Datos Del "
                + "Cliente");
        System.out.println("---------------------------------------------");
        System.out.println("Porfavor Ingrese el nombre del cliente");
        String nombre = sc.nextLine();
        System.out.println("Porfavor Ingrese la ciudad del cliente");
        String ciudad = sc.nextLine();
        System.out.println("Porfavor Ingrese la edad del cliente");
        int edad = sc.nextInt();

        c = new Cliente(nombre, edad, ciudad);

        for (int i = 0; i < 6; i++) {

            opcion = Interfaz();

            switch (opcion) {

                case 1:
                    p = NuevoTrajePlaya(c);
                    lista.add(p);
                    p.calcularValorFinal();
                    break;

                case 2:
                    l = NuevoTrajeFormal(c);
                    lista.add(l);
                    l.calcularValorFinal();
                    break;

                case 3:
                    e = NuevoTrajeFisica(c);
                    lista.add(e);
                    e.calcularValorFinal();
                    break;

                case 4:
                    f = NuevoTrajeFiesta(c);
                    lista.add(f);
                    f.calcularValorFinal();
                    break;

                case 5:
                    for (int m = 0; m < lista.size(); m++) {
                        System.out.println("--------------------------------"
                                + "------------------------------------------");
                        System.out.println(lista.get(m));
                    }

                    break;

            }

        }

        for (int m = 0; m < lista.size(); m++) {
            System.out.println(lista.get(m));
        }

    }

    public static int Interfaz() {
        int opcion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 1 para generar un traje tipo playa");
        System.out.println("Ingrese 2 para generar un traje tipo escuela formal");
        System.out.println("Ingrese 3 oara generar un traje tipo Educacion Fisica");
        System.out.println("Ingrese 4 para generar un traje tipo fiesta");
        System.out.println("Ingrese 5 para mostrar la lista de objetos");
        opcion = sc.nextInt();

        return opcion;

    }

    private static TrajePlaya NuevoTrajePlaya(Cliente c) {
        Scanner sc = new Scanner(System.in);
        TrajePlaya p;

        System.out.println("Porfavor Ingrese el valor Base");
        double valorBase = sc.nextDouble();
        System.out.println("Porfavor Ingrese el valor De La Gorra");
        double gorra = sc.nextDouble();
        System.out.println("Porfavor Ingrese el valor de la camiseta");
        double camiseta = sc.nextDouble();
        System.out.println("Porfavor Ingrese el valor de la pantaloneta");
        double pantaloneta = sc.nextDouble();

        p = new TrajePlaya(c, valorBase, gorra, camiseta, pantaloneta);

        return p;

    }

    private static TrajeEscuela NuevoTrajeFormal(Cliente c) {
        Scanner sc = new Scanner(System.in);
        TrajeEscuela l;

        System.out.println("Porfavor Ingrese el valor Base");
        double valorBase = sc.nextDouble();
        System.out.println("Porfavor Ingrese el valor de la chompa");
        double chompa = sc.nextDouble();
        System.out.println("Porfavor Ingrese el valor del pantalon");
        double pantalon = sc.nextDouble();
        System.out.println("Porfavor Ingrese el valor de la camisa");
        double camista = sc.nextDouble();
        System.out.println("Porfavor Ingrese el valor de la corbata");
        double corbata = sc.nextDouble();

        l = new TrajeEscuela(c, valorBase, chompa, pantalon, camista, corbata);

        return l;
    }

    private static TrajeEducacionFisica NuevoTrajeFisica(Cliente c) {
        Scanner sc = new Scanner(System.in);
        TrajeEducacionFisica e;

        System.out.println("Porfavor Ingrese el valorBase");
        double valorBase = sc.nextDouble();
        System.out.println("Porfavor Ingrese el valor del calentador");
        double calentador = sc.nextDouble();
        System.out.println("Porfavor Ingrese el valor de las medias");
        double medias = sc.nextDouble();

        e = new TrajeEducacionFisica(c, valorBase, calentador, medias);

        return e;
    }

    private static TrajeFiesta NuevoTrajeFiesta(Cliente c) {
        Scanner sc = new Scanner(System.in);
        TrajeFiesta f;

        System.out.println("Porfavor Ingrese el valor Base");
        double valorBase = sc.nextDouble();
        System.out.println("Porfavor Ingrese el valor del terno");
        double terno = sc.nextDouble();
        System.out.println("Porfavor Ingrese el valor de la camisa");
        double camisa = sc.nextDouble();
        System.out.println("Porfavor Ingrese el valor de los zapatos");
        double zapatos = sc.nextDouble();

        f = new TrajeFiesta(c, valorBase, terno, camisa, zapatos);

        return f;
    }

}
