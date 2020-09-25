package lab6_classes;

public class Cliente {
	String nome;
	String cpf;
	
	void inicializarCliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	void imprimir() {
		System.out.println("Nome do cliente: " + nome);
		System.out.println("CPF do cliente: " + cpf);
	}
}
