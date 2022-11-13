package edd_1358colaacotada;

import colaAcotadaE.ColaAcotada;

public class EDD_1358ColaAcotada {

    public static void main(String[] args) {
        ColaAcotada cola1 = new ColaAcotada();
        
        cola1.enqueue(1,12);
        cola1.enqueue(2,21);
        cola1.enqueue(3,23);
        cola1.enqueue(2,8);
        cola1.enqueue(1,0);
        cola1.enqueue(3,12);
        cola1.enqueue(7,122);
        cola1.enqueue(6,167);
        cola1.enqueue(4,218);
        cola1.enqueue(1,14);
        cola1.toString();
        cola1.longitud();
        cola1.dequeue();
        cola1.dequeue();
        cola1.dequeue();
        cola1.dequeue();
        cola1.estaVacia();
        cola1.longitud();
    }   
}