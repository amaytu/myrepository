package Questao2;
import java.util.Scanner;

public class App {
	
	public static void main (String[] args) {
	
		
		Pessoa pessoa = new Pessoa();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o seu nome:");
		pessoa.nome = scan.next();
		System.out.print("digite o seu peso: ");
		pessoa.peso = scan.nextDouble();
		System.out.print("digite a sua altura: ");
		pessoa.altura = scan.nextDouble();
		
		System.out.println("O IMC do(a) " + pessoa.nome + " é: " + pessoa.calcIMC());
		return;
	}

}
