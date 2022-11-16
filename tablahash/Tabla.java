import java.awt.*;
import java.net.*;
import java.io.*;
import java.awt.event.*;
import java.util.*;

class Tabla extends Frame {
  	Panel panel;
	TextField textver,textinser,textbus;
	TextArea textimpri;
	Button mostrar, buscar, insertar;
	Label lab1, lab2, titulo;
	public static final int size_hash =10;
    LinkedList []Arreglo = new LinkedList[size_hash];
    Lista_ligada prueba =  new Lista_ligada(Arreglo,size_hash);	 
  
  public Tabla(String title) {
   		super (title);
    	Font f = new Font( "Comic Sans MS", 0 , 13 );
		titulo = new Label("TABLA HASH");
		titulo.setBounds(180,20,400,50);
		Font ff = new Font( "Arial Black", 1 ,18 );
		titulo.setFont( ff );
		add(titulo);
        setFont( f );
        setResizable(false);	//PARA NO SER MAXINIZADO
		setBounds(150,100,500,450);  
		setLayout(null);
		
		textver = new TextField(40);
		textver.setBounds(60,170,400,25);			//AKI VEO COMENTARIOS,YA SEA LA LLAVE,SI ESTA O NO EL ELEMENTO
		
		textinser = new TextField(40);
		textinser.setBounds(180,90,130,25);			//AKI SE ESCRIBE LA CADENA PARA SER INSERTADA
	
		textbus = new TextField(40);
		textbus.setBounds(180,130,130,25);			//AKI SE ESCRIBE LA CADENA K KIERO BUSCAR
		
		textimpri = new TextArea(20,40);
		textimpri.setBounds(150,220,310,190);		//EN ESTA TEXTAREA SE USA PARA IMPRIMIR LA TABLA
		
		textver.setText("Introduzca una cadena arriba y haga click en el boton insertar ");
		
		textimpri.setEditable(false);				//NO SE PUEDE ESCRIBIR ES SOLO PARA MOSTRAR
		textver.setEditable(false);		   			//NO SE PUEDE ESCRIBIR ES SOLO PARA MOSTRAR
		textinser.setEditable(true);
		textbus.setEditable(true);
		
		insertar = new Button("INSERTAR");			//x, y, largo , ancho DEL BOTON
		insertar.setBounds(330,90,100,20);
		
		buscar = new Button("BUSCAR");
		buscar.setBounds(330,130,100,20);
		
		mostrar = new Button("Mostrar Tabla");
		mostrar.setBounds(55,240,90,25);		
		
		
		
		mostrar.setEnabled(false);		//DESABILITADO
		buscar.setEnabled(false);
	
		
		lab1 = new Label("Buscar Cadena: ");
		lab2 = new Label("Inserta Cadena: ");
		lab1.setBounds(60,130,110,20);
		lab2.setBounds(60,90,110,20);
		
		add(lab1);
		add(lab2);
		add(textver);
		add(textimpri);
		add(textinser);
		add(textbus);
		add(insertar);
		add(buscar);
		add(mostrar);

		
		mostrar.addActionListener(new accion());
		buscar.addActionListener(new accion());
		insertar.addActionListener(new accion());
		addWindowListener(new Cerrar());
		setVisible(true);
			
	}
	

///////////////////////////////////////////////////////////////////// 	
// AKI EN ESTA CLASE CONTROLO LOS EVENTOS DE LOS BOTONES...
  	
 class accion implements ActionListener
 	{
 		
   		public void actionPerformed(ActionEvent e)
  		{	
  			String com = e.getActionCommand();
  			 			
  			if (com.equals("INSERTAR"))
  			{
 				prueba.Insertar_Nodos(Arreglo);
		    	textinser.setText("");
		    	buscar.setEnabled(true);
		   		mostrar.setEnabled(true);		              
			}  	
  		
  		
			if( com.equals("BUSCAR") )
			{
  				prueba.Buscar(Arreglo);
		   		textbus.setText("");
  	   		}
    		
    			
    		if(com.equals("Mostrar Tabla") )
			{
				 prueba.Mostrar(Arreglo);
			}
 			 
 			 
 	
    	}
	}

/////////////////////////////////////////////////////////////////////////////////////////////
///CREO LA LISTA LIGADA PARA CADA INDICE O LLAVE
public class Lista_ligada{
	int size;
	LinkedList arreglo[];
	
		public Lista_ligada(LinkedList Arreglo[], int tam)
		{
			size= tam;
			int i;  
			  for (i=0; i<tam; i++)
			  	{
			   	   Arreglo[i] = new LinkedList();
			   	   Nodo indice= new Nodo(i);
			  	   Insertar(indice,Arreglo[i]);
			  	}
		}   		
		   		
		public Nodo Crea_Nodo(String cade, int posicion)///CREO UN NUEVO NODO
		{
			Nodo nuevo = new Nodo(cade,posicion);
			return nuevo;
		}  
		   		
	   	public  void Insertar(Nodo x, LinkedList lista)
	   	{
		   		   lista.addLast(x);
		}
		
		public  void Eliminar(int x, LinkedList lista)
		{
					lista.remove(x);
		}
		 
		
		public boolean Buscar_Copia(Nodo dato, LinkedList lista){//BUSCA EL ELEMENTO
		    int i=0;
			boolean bandera=false;
			Nodo obj;
			
			if (lista.size() == 1){
			    bandera=false;
			     }
			     
			     
			else{  
			       
				 while (i < lista.size()){
				  		obj= (Nodo)lista.get(i);
				  		if ((obj.Obtener_Cadena()).equals(dato.Obtener_Cadena())==false){
				  		   bandera=false;
				  		   i++;
				  		  }
				  		   
				  		else{
				  			bandera=true;
				  		    break;
				  		 	}	
		   		  		
		   		  		} 
		   		  		
		   		     	
		   		}    	  
				  
		   	 return bandera;
		   
		   	}
		   	
		   	
		   	 	 
		   	 	 
	/////////////////////////////////////////////////////////////////////////-/////////
	//FUNCION HASH DONDE OBTENGO LA LLAVE DE LA CADENA	   	 	   	
		
		public int hash (String key)	
		{
			int hashVal = 0;
				for (int i = 0; i < key.length(); i++){
					hashVal += key.charAt(i);
			    	}
		return hashVal % size;
		}
		
		
		
		public  void Insertar_Nodos(LinkedList Arreglo [])
		{
			String res;
			int  clave;
			String palabra;
			Nodo aux;
			boolean verificar;
			
			
			textver.setText("Introduce una cadena ");
			palabra=textinser.getText();
			clave=hash(palabra);
			aux=Crea_Nodo(palabra,clave);
			
			
			verificar=Buscar_Copia(aux,Arreglo[clave]);
			if(verificar==false)
				{
				Insertar(aux,Arreglo[clave]);
				textver.setText("Cadena Insertada... "+"La llave es: "+aux.Obtener_Posicion());////INDICO K HE INSERTADO LA CADENA
  	   		    }
			else
				textver.setText("El elemento '"+aux.Obtener_Cadena()+"' ya existe, ingresa otra");///SI EXISTE LA CADENA INDICO K YA EXISTE 
			                                                                                        ///Y POR LO TANTO DEBE INSERTAR OTRA CADENA
			System.out.print(verificar);
			
			System.out.println(clave);
	   }
		
		
	
    	public  void Buscar(LinkedList Arreglo[])
	  	{
	  		int i=1;
	  		String res;
			int  clave;
			String palabra;
			Nodo aux;
			boolean verificar;
			
	  		textver.setText("Introduce la cadena a buscar");///PIDO LA CADENA A BUSCAR
			
			palabra=textbus.getText();
			clave=hash(palabra);
			aux=Crea_Nodo(palabra,clave);
			
			verificar=Buscar_Copia(aux,Arreglo[clave]);
			if(verificar==false)
			   textver.setText("El elemento '"+aux.Obtener_Cadena()+"' NO encontrado");//SI NO SE ENCUENTRA MUESTRO EL MENSAJE
  	   		else
			textver.setText(" Elemento "+ "'"+palabra + "'"+" ENCONTRADO...... La llave es: "+clave);//SI LO ENCUENTRO INDICO K SI LO ENCONTRE
				
		
	   }	 
	   
	   
	   
	   
	   	public  void MostrarLista(LinkedList Pila)
	   			{
		   		  int i=1,j=0;
		   		  int tam=Pila.size();
		   		  Nodo obj;
		   		  textimpri.append("\n");
		   		  obj= (Nodo)Pila.get(j);
		   		  textimpri.append(obj.Obtener_Posicion()+ " --> " );
    	  
		   		  
		   		  while (i<tam){
		   		  		obj= (Nodo)Pila.get(i);
		   		  		textimpri.append(obj.Obtener_Cadena()+ " --> ");
		   		  		i++;
		   		  		} 
		   		  }		
		   		
		public void Mostrar(LinkedList Arreglo[])///METODO PARA MOSTRAR TODA LA TABLA
		{
			int i;
			textimpri.append("\nLa Tabla Hash es: ");
		   	  for (i=0; i<size_hash; i++)
		 	 	  MostrarLista(Arreglo[i]);
	
		}
}

class Cerrar extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			dispose();
			System.exit(0);
		}
	}


public static void main(String [] args) {
	
  	    new Tabla("TABLA HASH");
	   
	
	}
	
	
}

