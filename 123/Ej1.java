/**
 * Ej1.java
 * Programa simple que pide tres datos de tipo entero por teclado, los guarda y
 * los muestre ordenados (de menor a mayor) por pantalla.
 * Hecho y comentado por Ricardo Esteban.
 * 11/10/2017
 */

import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner teclado = new Scanner(System.in);
	
	int entero1, entero2, entero3;
	
	System.out.println("Escribe un número");
	entero1 = teclado.nextInt();
	
	System.out.println("Escribe otro número");
	entero2 = teclado.nextInt();
	
	System.out.println("Escribe el último número");
	entero3 = teclado.nextInt();
	
		//En este caso he utilizado el IF para saber cual es el mayor de los 3 números es el mayor
		//Si entero1 es mayor que entero2 y entero 3, irá primero. Luego quedará saber si entero2 es mayor que entero3 o al revés.
	if (entero1 > entero2) {
			if (entero1 > entero3) {
				System.out.println("El mayor número es " + entero1);
				if (entero2 > entero3) {
					System.out.println("El 2º número es " + entero2);
					System.out.println("El menor número es " + entero3);
										}
				else {
					System.out.println("El 2º número es" + entero3);
					System.out.println("El menor número es " + entero2);
					}
									}			
									
								}
		
		//Si entero2 es mayor que entero1 y entero 3, irá primero. Luego quedará saber si entero1 es mayor que entero3 o al revés.
	if (entero2 > entero1) {
			if (entero2 > entero3) {
				System.out.println("El mayor número es " + entero2);
				if (entero1 > entero3) {
					System.out.println("El 2º número es " + entero1);
					System.out.println("El menor número es " + entero3);
										}
				else {
					System.out.println("El 2º número es" + entero3);
					System.out.println("El menor número es " + entero1);
					}
									}			
									
								}
		//Si entero3 es mayor que entero2 y entero 1, irá primero. Luego quedará saber si entero2 es mayor que entero1 o al revés.
	if (entero3 > entero1) {
			if (entero3 > entero2) {
				System.out.println("El mayor número es " + entero3);
				if (entero2 > entero1) {
					System.out.println("El 2º número es " + entero2);
					System.out.println("El menor número es " + entero1);
										}
				else {
					System.out.println("El 2º número es " + entero1);
					System.out.println("El menor número es " + entero2);
					}
									}			
									
								}
		
}
}
