package lab6_classes;

public class Banco {
	String nome;
	int numero;
	
	void inicializarBanco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Número do banco: " + numero);
	}
}
