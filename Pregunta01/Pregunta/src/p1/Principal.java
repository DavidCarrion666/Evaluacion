/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
import java.util.ArrayList;
import p2.Jugo;
import p3.*;
import p4.*;
        
/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ArrayList<Jugo> lista = new ArrayList();
        Cliente c = new Cliente("David");
        
        JugoEconomico g1 = new JugoEconomico();
        JugoEconomico g2 = new JugoEconomico();
        JugoTipoDos g3 = new JugoTipoDos();
        JugoTipoTres g4 = new JugoTipoTres();
        JugoTipoTres g5 = new JugoTipoTres();
        // -------------------------------------------
        JugoTipoDos g6 = new JugoTipoDos();
        JugoTipoTres g7 = new JugoTipoTres();
        JugoEconomico g8 = new JugoEconomico();
        
        lista.add(g1);
        lista.add(g2);
        lista.add(g3);
        lista.add(g4);
        lista.add(g5);
        lista.add(g6);
        lista.add(g7);
        lista.add(g8);
                    
        /*
        Agregar a la solución
        JugoTipoDos g6 = new JugoTipoDos();
        JugoTipoTres g7 = new JugoTipoTres();
        JugoEconomico g8 = new JugoEconomico();
        
        Analizar y aplicar los prinicipios SOLID, segun corresponda. Además
        revisar que el reporte sea completo, sin valores nulos.
        */
        g1.establecerVFinal();
        g2.establecerVFinal();
        g3.establecerVFinal();
        g4.establecerVFinal();
        g5.establecerVFinal();
        g6.establecerVFinal();
        g7.establecerVFinal();
        g8.establecerVFinal();
        
        Venta v = new Venta();
        v.establecerCliente(c);
        v.establecerLista(lista);
        v.establecerValorVenta();
        
       System.out.printf("%s\n", v);


    }
    
}
