package paquete;


/**
 * Ecuacion.java
 * Escribe un programa que calcule las soluciones de una ecuación de segundo grado 
 * de la forma ax2 + bx + c = 0
 * @author dam17-14
 *
 */
import java.lang.Math;
public class Ej1 {

	public static void evaluarDiscriminante(double a, double b, double c) {
		
		// variable de clase como variable global
		double d = Math.pow(b, 2) - 4*(a*c);
		double raiz_unica = (-c)/b;
		
		if ((a == 0) && (b == 0)) System.out.println("Ecuacion degenerada");
		
		else {
			//System.out.println("Ecuacion con dos raices");
			if (d >= 0) {
				System.out.println("Ecuacion con dos raices reales");
				double X1 = (-b + Math.sqrt(d))/2*a;
				double X2 = (-b - Math.sqrt(d))/2*a;
				System.out.println("X1 = " + X1);
				System.out.println("X2 = " + X2);
			}
			else {
				System.out.println("Ecuacion con dos raices complejas tipo x + yi y x - yi");
				double X1 = (-b + Math.sqrt(d))/2*a;
				double X2 = (-b - Math.sqrt(d))/2*a;
				System.out.println("X1 = " + X1);
				System.out.println("X2 = " + X2);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		evaluarDiscriminante(1,1,-1);
	}

}