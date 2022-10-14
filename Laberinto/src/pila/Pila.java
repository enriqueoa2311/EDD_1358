/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import pila.Nodo;
/**
 *
 * @author Enrique Ortega
 */
public class Pila<T> {
    private Nodo<T> base;
    private Nodo<T> tope;
    private int longitud = 0;

    public Pila() {
    }
    
    public boolean estaVacia(){
        if(base == null){
            return true;
        } else {
            return false;
        }
    }
    
    public int getLongitud(){
        return longitud;
    }
    
    public T pop(){
        if(tope != null){
            Nodo<T> temp = tope;
            if(temp.abajo != null){
                tope = temp.abajo;
                longitud--;
            } else {
                this.base = null;
                this.tope = null;
                longitud = 0;
            }
            return temp.dato;
        } else {
            return null;
        }
    }
    
    public void push(T elemento){
        if(tope == null){
            Nodo<T> nuevo = new Nodo(null, elemento);
            this.tope = nuevo;
            this.base = nuevo;
            longitud++;
        } else {
            Nodo<T> nuevo = new Nodo(tope, elemento);
            this.tope = nuevo;
            longitud++;
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Nodo<T> actual = tope;
        while(actual != null){
            sb = sb.append("/" + actual.dato);
            actual = actual.abajo;
        }
        return sb.toString();
    }
}