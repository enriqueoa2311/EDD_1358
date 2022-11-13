package colaAcotadaE;

import java.util.Optional;

public class ColaAcotada<T> {
    private Nodo<T> inicio;
    private Nodo<T> fin;
    private int numElementos;

    public ColaAcotada() {
        this.inicio = null;
        this.fin = null;
        this.numElementos = 0;
    }
    
    public void ColaAcotada(int niveles) {
        for(int i = 0; i < niveles; i++){
            niveles++;
        }
    }
    
    public boolean estaVacia(){
        boolean cola = false;
        if(inicio == null && fin == null){
            cola = true;
            System.out.println("La cola está vacía");
        } else {
            System.out.println("La cola tiene elementos");
        } return cola;
    }
    
    public int longitud(){
        int contador = 0;
        Nodo n = this.inicio;
        while(n != null){
            contador++;
            n = n.getSiguiente();
        }
        System.out.println("Número de elementos en la cola: " + contador);
        return contador;
    }
    
    public void enqueue(T elemento, int prioridad){
        Nodo<T> nodo = new Nodo<>(elemento, null, prioridad);
        
        if(inicio == null){
            inicio = nodo;
            fin = nodo;
        } else {
            Nodo<T> aux = inicio;
            
            if(aux.getPrioridad() < prioridad){
                inicio = nodo;
                inicio.setSiguiente(aux);
            } else {
                Nodo<T> penultimoElemento = null;
                
                while(aux != null && aux.getPrioridad() >= prioridad){
                    penultimoElemento = aux;
                    aux = aux.getSiguiente();
                }
                penultimoElemento.setSiguiente(nodo);
                nodo.setSiguiente(aux);
            }
        }
        this.numElementos++;
    }
    
    public Optional<T> dequeue(){
        Optional<T> elemento = Optional.empty();
        
        if(this.numElementos > 0){
            elemento = Optional.of(inicio.getElemento());
            this.numElementos--;
            
            inicio = inicio.getSiguiente();
        }
        return elemento;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Nodo<T> aux = inicio;
        
        while(aux != null){
            sb.append(aux.getElemento() + ", Prioridad: " + aux.getPrioridad());
            aux = aux.getSiguiente();
        }
        return sb.toString();
    }
}