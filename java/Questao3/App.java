package Questao3;
import java.util.Scanner;

public class App {
	
	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		for (int i =0; i<= 2; i++) {
			Pessoa pessoa[] = new Pessoa[3];
			Pessoa pes = new Pessoa();
			
			System.out.print("Digite o seu nome:");
			pes.nome = scan.next();
			System.out.print("digite o seu peso: ");
			pes.peso = scan.nextDouble();
			System.out.print("digite a sua altura: ");
			pes.altura = scan.nextDouble();
			pessoa[i] = pes;
		}
		
		for (int i = 2; i>=0; i--) {
			System.out.println("O IMC do(a) " + pessoa[i].nome + " é: " + pessoa[i].calcIMC());
		}
		
scan.close();
}
	
}
