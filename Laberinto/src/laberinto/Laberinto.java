/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laberinto;

import java.util.ArrayList;
import pila.Pila;
import laberinto.Posicion;

/**
 *
 * @author Enrique Ortega
 */
public class Laberinto {
    
    private final Posicion inicio;
    private final Posicion fin;
    private ArrayList<String> huella;
    private ArrayList<Posicion> test;
    private Pila<Posicion> pila;
    private Posicion posicionActual;
    
    public Laberinto(){
        inicio = new Posicion (1,1);
        fin = new Posicion (8,8);
        posicionActual = inicio;
        pila = new Pila<>();
        test = new ArrayList<>();
    }
    
    public static final int mapaLaberinto [][] =
        {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 0, 1, 0, 0, 0, 1, 0, 1},
        {1, 0, 0, 1, 0, 0, 0, 1, 0, 1},
        {1, 0, 0, 0, 0, 1, 1, 0, 0, 1},
        {1, 0, 1, 1, 1, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
        {1, 0, 1, 0, 0, 0, 1, 0, 0, 1},
        {1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
        {1, 1, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
    
    public static void imprimirLaberinto(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(mapaLaberinto[i][j] == 1){
                    System.out.print(" ■");
                } else {
                    System.out.print("  ");
                }
            } System.out.println();
        }
    }
    
    public boolean moverAbajo(){
        String s = posicionActual.getX() + "" + (posicionActual.getY() + 1);
        if((mapaLaberinto[posicionActual.getX()][posicionActual.getY() + 1] != 1) & !llego(s)){
            huella.add(s);
            return true;
        }
        return false;
    }
    
    public boolean moverDerecha(){
        String s = (posicionActual.getX() + 1) + "" + posicionActual.getY();
        if(mapaLaberinto[posicionActual.getX() + 1][posicionActual.getY()] != 1 & !llego(s)){
            huella.add(s);
            return true;
        }
        return false;
    }
    public boolean moverArriba(){
        String s = posicionActual.getX() + "" + (posicionActual.getY() - 1);
        if((mapaLaberinto[posicionActual.getX()][posicionActual.getY() - 1] != 1) & !llego(s)){
            huella.add(s);
            return true;
        }
        return false;
    }
    
    public boolean moverIzquierda(){
        String s = (posicionActual.getX() - 1) + "" + posicionActual.getY();
        if((mapaLaberinto[posicionActual.getX() - 1][posicionActual.getY()] != 1) & !llego(s)){
            huella.add(s);
            return true;
        }
        return false;
    }
    
    public boolean llego(String posicion){
        return huella.contains(posicion);
    }
    
    public void mover(){
        if(moverDerecha()){
            Posicion temp = new Posicion(posicionActual.getX() + 1, posicionActual.getY());
            test.add(temp);
            pila.push(temp);
        } else if (moverAbajo()){
            Posicion temp = new Posicion(posicionActual.getX(), posicionActual.getY() + 1);
            test.add(temp);
            pila.push(temp);
        } else if (moverArriba()){
            Posicion temp = new Posicion(posicionActual.getX(), posicionActual.getY() - 1);
            test.add(temp);
            pila.push(temp);
        } else if(moverIzquierda()){
            Posicion temp = new Posicion(posicionActual.getX() - 1, posicionActual.getY());
            test.add(temp);
            pila.push(temp); 
        } else {
            posicionActual = pila.pop();
        }
    }
    
    public void imprimirHuella(){
        for(int i = 0; i < huella.size(); i++){
            System.out.print(huella.get(i) + ",");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        Laberinto l = new Laberinto();
        l.huella = new ArrayList<>();
        l.huella.add("11");
        l.pila.push(l.inicio);
        while (l.posicionActual.getX() != 8 || l.posicionActual.getY() != 8) {
            l.mover();
        }
        imprimirLaberinto();
        System.out.println("La siguiente es la huella, la longitud es: " + l.huella.size());
        l.imprimirHuella();
    }
}