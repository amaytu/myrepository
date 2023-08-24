package Questao3;

public class Pessoa {

	public String nome;
	public double peso;
	public double altura;
	
	public double calcIMC() {
		
		return (peso/(altura*2));
	}
}
