package colaE;

public class Cola {
    private Nodo inicio;
    private Nodo fin;

    public Cola() {
        inicio = null;
        fin = null;
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
        System.out.println("Número de elementos en la pila: " + contador);
        return contador;
    }
    
    public void enqueue(int valor){
        Nodo n = new Nodo(valor);
        n.setSiguiente(null);
        if(inicio == null && fin == null){
            inicio = n;
            fin = n;
        }
        fin.setSiguiente(n);
        fin = fin.getSiguiente();
    }
    
    public int dequeue(){
        int valor = inicio.getValor();
        inicio = inicio.getSiguiente();
        return valor;
    }

    @Override
    public String toString() {
        Nodo n = this.inicio;
        String s = "";
        while(n != null){
            s = s + n.toString();
            n = n.getSiguiente();
    }
    return s;
    }
}