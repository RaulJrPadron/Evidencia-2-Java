package Ev2;

import java.util.Scanner;

public class Run {
	public static double PI = 3.1415;
	
	//Calcular circunferencia
	public static double calcularCircunferencia(int radio) {
		double circunferencia;
		circunferencia = 2*PI*radio;
		return circunferencia;
	}
	
	public static double calcularArea(int radio) {
		double area;
		area = PI*(Math.pow(radio, 2));
		return area;
	}
	
	public static void main(String[] args) {
		double resArea = calcularArea(3);
		double resCircunferencia = calcularCircunferencia(5);
		System.out.println("El resultado de la circunferencia es de: " + resCircunferencia + " y del área es: "+ resArea);
	}
}
