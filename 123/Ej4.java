/**
 * Ej4.java
 * Hecho y comentado por Ricardo Esteban
 * Escribe un programa simple que lea una serie de números enteros por teclado e indique cuál es el mayor de todos ellos.
 * No se deben guardar los datos introducidos; sólo debe ir guardándose el que vaya siendo mayor.
 * Cada vez que se lee un dato el programa pregunta si se quiere seguir. Se debe pulsar la tecla S para seguir.
 * 30/10/2017
 */

import java.util.Scanner;
public class Ej4{
	
	public static void main(String[] args) {
	
int dato, i = 1; 
int mayor = Integer.MIN_VALUE; 
String tecla = "S";
String confirmación;
boolean seguir = true;
  Scanner tecladonum = new Scanner (System.in);
  Scanner tecladoletra = new Scanner (System.in);
  
  do { 
	 
	  System.out.println("Introduzca el " +i+ "º numero: ");
	  dato = tecladonum.nextInt();
   
	  System.out.println("El "+i+"º número es: "+dato);
   
	  i++;

	  //Aquí compara los datos
	  if ( dato > mayor ) {
		  mayor = dato; }
	  
	  
	  //Aquí te confirmación.
	  System.out.println("Para continuar pulse la tecla S");
		confirmación = tecladoletra.next();
		 if (tecla.equals(confirmación.toUpperCase()))
		 				continue;
		 else {
			 	seguir = false;
			 	continue;
		 }
  }
 
  			while (seguir);
				System.out.println("El mayor es: " + mayor );
	}
}
