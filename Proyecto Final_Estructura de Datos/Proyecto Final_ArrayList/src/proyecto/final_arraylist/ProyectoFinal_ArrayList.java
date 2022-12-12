package proyecto.final_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ProyectoFinal_ArrayList {

    public static void main(String[] args) {
        ArrayList nuevo = new ArrayList();
        //Comprobar si tiene elementos
        if(nuevo.isEmpty() == true){
            System.out.println("La lista está vacía");
        } else {
            System.out.println("La lista tiene " + nuevo.size() + " elementos");
        }
        //Añadir elementos a la lista
        nuevo.add((2));
        nuevo.add((6));
        nuevo.add((1));
        nuevo.add((8));
        nuevo.add((28));
        nuevo.add((16));
        nuevo.add((25));
        nuevo.add(500);
        nuevo.add("Enrique");
        nuevo.add("Ortega");
        nuevo.add("Proyecto Final");
        //Recorrer e imprimir la lista
        for (int i = 0; i < nuevo.size(); i++){
            System.out.print(nuevo.get(i) + " ");
        }
        //Comprobar si tiene elementos
        if(nuevo.isEmpty() == true){
            System.out.println("\nLa lista está vacía");
        } else {
            System.out.println("\nLa lista tiene " + nuevo.size() + " elementos");
        }
        //Recorrer e imprimir la lista
        for (int i = 0; i < nuevo.size(); i++){
            System.out.print(nuevo.get(i) + " ");
        }
        //Corroborar que el elemento "Enrique" se encuentre en la lista
        if(nuevo.contains("Enrique") == true){
            System.out.println("\nEl elemento está en la lista");
        } else {
            System.out.println("Elemento no encontrado");
        }
        //Imprimir en pantalla el tamaño de la lista
        System.out.println("Tamaño total de la lista: " + nuevo.size());
        //Agregar un nuevo elemento a la lista
        nuevo.add(29);
        //Recorrer e imprimir la lista
        for (int i = 0; i < nuevo.size(); i++){
            System.out.print(nuevo.get(i) + " ");
        }
        //Imprimir en pantalla el tamaño de la lista
        System.out.println("\nTamaño total de la lista: " + nuevo.size());
        //Verificar qué elemento se encuentra en la séptima posición
        System.out.println("Elemento en la posición 7: " + nuevo.get(7));
        //Imprimir en pantalla el tamaño de la lista
        System.out.println("Tamaño total de la lista: " + nuevo.size());
        //Eliminar el elemento que se encuentra en la sexta posición
        System.out.println("Remover de la posición 6" + "\nDato a remover:" + nuevo.remove(6));
        //Imprimir en pantalla el tamaño de la lista
        System.out.println("Tamaño total de la lista: " + nuevo.size());
        for(int i = 0; i < nuevo.size(); i++){
            System.out.print(nuevo.get(i) + " ");
        }
    }   
}