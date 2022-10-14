/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author Enrique Ortega
 */
public class Nodo<T> {
    public Nodo <T> abajo;
    public T dato;

    public Nodo(Nodo abajo, T dato) {
        this.abajo = abajo;
        this.dato = dato;
    }
}