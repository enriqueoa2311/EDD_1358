package edd_1358cola;

import colaE.Cola;

public class EDD_1358Cola {

    public static void main(String[] args) {
        Cola cola1 = new Cola();
        cola1.enqueue(48);
        cola1.enqueue(80);
        cola1.enqueue(97);
        cola1.enqueue(3);
        cola1.enqueue(12);
        cola1.enqueue(120);
        cola1.dequeue();
        cola1.estaVacia();
        cola1.longitud();
    }
    
}
