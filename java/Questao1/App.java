package Questao1;

import java.util.Scanner;

public class App {
	
	public static void main (String[] args) {
		
		Retangulo retangulo = new Retangulo();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base do seu retangulo: ");		
		retangulo.base = scan.nextDouble();
		System.out.println("Digite a altura do seu retangulo: ");
		retangulo.altura = scan.nextDouble();
		
		System.out.println("A area do retangulo é: " + retangulo.calcArea());
		System.out.println("O perimetro do retangulo é: " + retangulo.calcPerimetro());
		
	}
	
}
