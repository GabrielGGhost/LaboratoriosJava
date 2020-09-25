package laboratorio8_sobrecarga;

public class Banco {
	
	private int numero;
	private String nome;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	void inicializarBanco(String nome, int numero) {
		this.setNome(nome);
		this.setNumero(numero);
	}
	
	void imprimir() {
		System.out.println("BANCO: " + this.getNome() + '\t' + "NUMERO: " + this.getNumero());
	}
}
