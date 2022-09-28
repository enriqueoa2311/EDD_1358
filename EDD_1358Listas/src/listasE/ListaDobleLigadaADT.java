package listasE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Enrique Ortega
 */
public class ListaDobleLigadaADT<T> {
    private NodoDoble<T> head;
    private NodoDoble<T> tail;
    int tamanio;
    
    public ListaDobleLigadaADT (){
        this.head = null;
        this.tail = null;
        this.tamanio = 0;
    }
    
    public boolean estaVacia(){
        if(head == null){
            return true;
        } else {
            return false;
        }
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public void agregarAlInicio(T valor){
        NodoDoble<T> nuevo = new NodoDoble(valor);
        if(head == null){
            head = nuevo;
        } else {
            nuevo.setSiguiente(this.head);
            this.head = nuevo;
        }
    }
    
    public void agregarAlFinal(T valor){
        NodoDoble<T> nuevo = new NodoDoble(valor);
        if(head == null){
            this.head = nuevo;
        } else {
            NodoDoble<T> aux = this.head;
            while(aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
        }
    }
    
    public void agregarDespuesDe(T valor, int posicion){
        NodoDoble<T> nuevo = new NodoDoble(valor);
        NodoDoble<T> aux = this.head;
        for(int contador = 1; contador <= posicion - 1; contador++){
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        aux.setSiguiente(nuevo);
    }
    
    public void eliminarElPrimero(){
        if(head == null)
            return;
        NodoDoble<T> aux = this.head;
        if(head == tail){
            head = tail = null;
        } else {
            (aux.siguiente).anterior = null;
            head = aux.getSiguiente();
        }
    }
    
    public void eliminarElUltimo(){
        if(head == null)
            return;
        NodoDoble<T> aux = this.tail;
        if(tail == head){
            tail = head = null;
        }
        while(aux != null){
            aux.anterior.siguiente = null;
            tail = aux.getAnterior();
        }
    }
    
    public void eliminar(int posicion){
        NodoDoble<T> nuevo = this.head;
        for(int i = 1; i <= posicion - 1; i++) {
            nuevo = nuevo.getSiguiente();
        }
        nuevo.setSiguiente(nuevo.getSiguiente().getSiguiente());
    }
    
    public boolean buscarElemento(T valor){
        
        return false;
        
    }
        
        
    public void actualizarElemento(T valor){
        NodoDoble<T> nuevo = new NodoDoble (valor);
    }
    
    public void transversal(){
        NodoDoble nuevo = this.head;
        if(nuevo != null){
            while(nuevo != null){
                System.out.print(nuevo);
                nuevo = nuevo.getSiguiente();
            }
        } else {
            System.out.print("La lista está vacía");
        }
        System.out.println("");
    }
}