package colaAcotadaE;

public class Nodo<T> {
    private T elemento;
    private Nodo<T> siguiente;
    private int prioridad;

    public Nodo(T elemento, Nodo<T> siguiente) {
        super();
        this.siguiente = siguiente;
        this.elemento = elemento;
    }

    public Nodo(T elemento, Nodo<T> siguiente, int prioridad) {
        super();
        this.elemento = elemento;
        this.siguiente = siguiente;
        this.prioridad = prioridad;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Nodo{" + "elemento=" + elemento + ", siguiente=" + siguiente + ", prioridad=" + prioridad + '}';
    }
}