import java.io.*;
public class Nodo{
		
	String dato;
	int posicion;
	Nodo siguiente;
	
	
	public Nodo(){}
	
	public Nodo(int posicion){
		 siguiente=null;
		 this.dato=" ";
		 this.posicion=posicion;
	}
	public Nodo (String dato, int posicion)
	    {
	       siguiente=null;	
		   this.dato=dato;
		   this.posicion=posicion;
		}
		
	
	public Nodo(String dato,int posicion, Nodo sigue)
		{
		  this.dato=dato;
		  this.posicion=posicion;
		  this.siguiente=sigue;
		}
		
		  	
	public String Obtener_Cadena()
		{
			return dato;
		}
		
	public int Obtener_Posicion()
		{
			return posicion;
		}	
			
}
