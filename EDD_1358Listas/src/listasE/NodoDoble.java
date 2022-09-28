package listasE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Enrique Ortega
 */
public class NodoDoble<T> {
    private T dato;
    public NodoDoble<T> siguiente;
    public NodoDoble<T> anterior;

    public NodoDoble() {
    }

    public NodoDoble(T valor) {
        this.dato = valor;
    }

    public NodoDoble(T dato, NodoDoble<T> siguiente, NodoDoble<T> anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return " Dato: " + dato + "-->";
    }
    
    public String printAll(){
        return "[Dato = " + dato + "] -> [Anterior: " + this.getAnterior() + "] -> [Siguiente: " + this.getSiguiente() + "]";
    }
}