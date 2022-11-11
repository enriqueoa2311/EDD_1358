package colaE;

public class Nodo<T> {
    private int valor;
    private Nodo siguiente;
    
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}