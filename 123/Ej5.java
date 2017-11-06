/**
 * Ej5.java
 * Escribe un programa simple que lea tantos números enteros positivos como se quiera mientras no sea un cero, que terminaría. 
 * Cuando termina la entrada, se muestra, como resultado, la suma de todos los números leídos y su media aritmética.
 * No hay que guardar los valores individualmente introducidos.
 * 30/10/2017
 */

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int contador = 0;
		int sumatotal = 0;
		int numero = -1;



		//Mientras el valor que introduzcamos sea distinto a 0, el bucle seguirá funcionando.
		while (numero !=0) {

			System.out.println("Introduce un número: ");
			numero = teclado.nextInt();
			
			//Si el número es menor que 0 (negativo), se terminará el bucle.
			if (numero < 0){
				System.out.println("Dato incorrecto, el número debe ser positivo.");
			}
			else {


				contador++;
				sumatotal = sumatotal + numero;
			}
		}
		//Sumas
		int aritmetica = sumatotal/contador;
		System.out.println("La suma total es: " + sumatotal);
		System.out.println(" La media aritmética es: " + aritmetica);


	}
}

