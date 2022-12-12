package proyectofinal_linkedlist;

import java.util.LinkedList;

public class ProyectoFinal_LinkedList {

    public static void main(String[] args) {
        LinkedList<String> peliculas = new LinkedList<>();
        //Añadir elementos a la lista enlazada
        peliculas.add("Gattaca");
        peliculas.add("Scarface");
        peliculas.add("The Godfather II");
        peliculas.add("Taxi Driver");
        peliculas.add("Pulp Fiction");
        peliculas.add("León");
        peliculas.add("Requiem for a Dream");
        peliculas.add("Fight Club");
        peliculas.add("Trainspotting");
        peliculas.add("A Orange Clockwork");
        //Mostrar en pantalla los elementos de la lista
        System.out.println("Lista enlazada: " + peliculas);
        //Añadir elemento con el parámetro de índice
        peliculas.add(1, "Joker");
        peliculas.add(5, "Matrix");
        //Mostrar en pantalla los elementos de la lista
        System.out.println("Lista actualizada: " + peliculas);
        //Mostrar el elemento que se encuentra en la octava posición
        System.out.println("El elemento en la octava posición es: " + peliculas.get(8));
        //Cambiar elemento que se encuentra en la séptima posición
        peliculas.set(7, "American Psycho");
        //Mostrar en pantalla los elementos de la lista
        System.out.println("Lista actualizada: " + peliculas);
        //Eliminar elementos de la lista enlazada
        peliculas.remove(4);
        peliculas.remove(5);
        peliculas.remove(8);
        //Mostrar en pantalla los elementos de la lista
        System.out.println("Lista actualizada: " + peliculas);
        //Añadir elemento al principio de la lista
        peliculas.addFirst("Seven");
        //Añadir elemento al final de la lista
        peliculas.addLast("Men In Black");
        //Mostrar en pantalla los elementos de la lista
        System.out.println("Lista actualizada: " + peliculas);
    }   
}
