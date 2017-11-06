/**
 * 
 * Hecho y comentado por Ricardo Esteban
 * Escribe un programa simple que pida un número entero y a partir de él cree 
 * en pantalla de texto un cuadrado de asteriscos con ese tamaño de lado.
 * Los asteriscos sólo se verán en el borde del cuadrado.
 * 30/10/2017
 */

import java.util.Scanner;

public class Ej8{

	public static void main(String[] args){
		
		
		int cuadrado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique tamaño del cuadrado: ");
		
		cuadrado = teclado.nextInt();
		
		for (int i = 1; i<= cuadrado; i++){
			
			for (int j = 1; j<= cuadrado; j++){
				if ( j == 1 || j == cuadrado || i == 1 || i == cuadrado ){
							System.out.print("* ");
						}else{ 
							System.out.print("  ");
							
				}
			}
			System.out.println();
		}
	}
}	
