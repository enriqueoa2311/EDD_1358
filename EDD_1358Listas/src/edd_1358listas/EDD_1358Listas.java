/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd_1358listas;

import listasE.ListaDobleLigadaADT;
import listasE.NodoDoble;

/**
 *
 * @author Enrique Ortega
 */
public class EDD_1358Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Implementación de Lista Doblemente Ligada");
        ListaDobleLigadaADT<Integer> listaE = new ListaDobleLigadaADT();
        listaE.transversal();
        listaE.agregarAlInicio(20);
        listaE.agregarAlFinal(80);
        listaE.agregarDespuesDe(50, 2);
        listaE.transversal();
        listaE.eliminarElPrimero();
        listaE.transversal();
        listaE.agregarAlFinal(200);
        listaE.transversal();
        listaE.eliminar(2);
        listaE.transversal();
        listaE.agregarDespuesDe(99, 2);
        listaE.transversal();
        listaE.agregarDespuesDe(120, 3);
        listaE.agregarDespuesDe(128, 4);
        listaE.agregarDespuesDe(49, 5);
        listaE.transversal();
        listaE.eliminarElPrimero();
        listaE.transversal();
        listaE.eliminarElUltimo();
        listaE.transversal();
    }
}
