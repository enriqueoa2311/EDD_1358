package proyectofinal_stack;

import java.util.Stack;
import java.io.*;

public class ProyectoFinal_Stack {

//Creación de un programa que identifique un palíndromo utilizando una Pila
//Palíndromo: Palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda

//Nota: Este programa también funciona con números, los cuales se conocen como números capicúa

    public static void main(String[] args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> pila;
        String palabra;
        boolean palindromo;
        pila = new Stack<Character>();
        try {
            System.out.println("Introduzca una palabra o frase (utilizando igual tipo de caracter y sin contener espacios): ");
            while ((palabra = entrada.readLine()) != null){
                for (int i = 0; i < palabra.length(); i++){
                    pila.push((palabra.charAt(i)));
                }
                palindromo = true;
                int i = 0;

                while (palindromo && !pila.empty())
                {
                    Character p;
                    p = pila.pop();
                    palindromo = p.charValue() == palabra.charAt(i++);
                }
                if (palindromo && pila.empty())
                    System.out.println("La palabra o expresión " + palabra + " es un palíndromo");
                else
                    System.out.println(palabra + " no es un palíndromo");
            }
        }
        catch (Exception e) {;}
    }
}