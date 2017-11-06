import java.util.Scanner;

/**
 * Hecho y comentado por Ricardo Esteban Vivancos
 *Escribe un programa simple que calcule el interés producido y el capital total acumulado de un capital
 *inicial invertido a un tipo de interés anual.
 *Debe pedir el capital principal inicial,  el tipo de interés anual y el número de años.
 *Muestra el valor de los intereses y el capital final acumulado.
 *Se puede utilizar la fórmula: Capitalfinal = CapitalInicial * (1 + interes)nº de años
 *20/10/2017
 */
public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		
		//Para hacer este ejercicio he ido "partiendo" la fórmula que nos daba el enunciado.
		System.out.println("Introduce el capital princial inicial ");
		double capitalinicial = teclado.nextDouble();

		System.out.println("Introduce el tipo de interés anual ");
		double interes = teclado.nextDouble();

		System.out.println("Introduce el nº de años ");
		double años = teclado.nextDouble();
		
		double interes2;
		interes2 = interes / 100;

		double suma = 1 + interes2;
		
		double parentesis;
		//Math.pow se usa para calcular potencias
		parentesis = Math.pow(suma, años);
		
		
		double capitalfinal;
		capitalfinal = capitalinicial * parentesis;
		
		
		System.out.println("El capital final es " + capitalfinal + " euros.");
		

	}

}

