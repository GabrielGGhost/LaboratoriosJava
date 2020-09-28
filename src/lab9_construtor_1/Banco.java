package lab9_construtor_1;

public class Banco {

	private String nome;
	private int numero;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	Banco(String nome, int numero){
		this.setNome(nome);
		this.setNumero(numero);
	}
	
	void imprimir() {
		System.out.println("BANCO: " + this.getNome() + '\t' + "No" + this.getNumero());
	}
}
