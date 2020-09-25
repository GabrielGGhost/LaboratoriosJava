package laboratorio6;

public class Agencia {
	
	int numero;
	String nome;
	Banco banco;
	
	void inicializarAgencia(int numero, String nome, Banco banco) {
		this.nome = nome;
		this.numero = numero;
		this.banco = banco;
	}
	
	void imprimir() {
		System.out.println("Número da agência: " + numero);
	}
}
