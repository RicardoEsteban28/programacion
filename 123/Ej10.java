/**
 * 
 * Hecho y comentado por Ricardo Esteban
 * Escribe un programa simple que pida tres valores reales a, b, c 
 * 30/10/2017
 */

import java.util.Scanner;
public class Ej10 {
	


	public static void main(String[] args) {
			
			
	double a = 0;
	double b = 0;
	double c = 0;
	double x1; //Formula positiva
	double x2; //Formula negativa
	double raizunica; 
	double d = (b*b - 4 * a * c); 
	boolean continuar = true;
			Scanner teclado = new Scanner (System.in);
			
			System.out.println("Introduce el valor a");
			
			a = teclado.nextDouble();
			
			System.out.println("Introduce el valor b");
			
			b = teclado.nextDouble();
			
			System.out.println("Introduce el valor c");
			
			c=teclado.nextDouble();

			do {
				
				// Si los valores son 0
					if ( a == 0 && b == 0) {
				System.out.println("La ecuación es degenerada, por lo que la ecuación tiene soluciones infinitas");
						continuar = false;
						continue;
				}
					
				
				if ( a == 0 && b != 0 ) {
				
				raizunica = -c / b ;
				System.out.println("El resultado es: " +c );
						continuar = false;
						continue;
				}
				
	0
				if (d >= 0){
					
					//Ecuación positiva
					x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / ( 2 * a);
					//Ecuación negativa
					x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / ( 2 * a);
					
					
					System.out.println( "La ecuación positiva es:" +x1);
					System.out.println( "La ecuación negativa es:" +x2);
							continuar = false;
							continue;
					} 
				
				if ( d < 0) {
					System.out.print("Esta ecuación no es de segundo grado");
							continuar = false;
							continue;
				}
				
					// Para salir del programa.
					} while (continuar); 
			
			
				
			}		
	}			

