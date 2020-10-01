/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package Labs18_List.aj3.beans;

public class Cliente {

	private String nome;
	private String telefone;
	private String cpf;
	private int id;

	public Cliente(String nome, String telefone, String cpf, int id) {
		this(nome, telefone, cpf);
		this.setId(id);
	}

	public Cliente(String nome, String telefone, String cpf) {
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setCpf(cpf);
	}

	public String getCpf() {
		return this.cpf;
	}

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		String cliente = " ID [" + this.getId() + "]";
		cliente += this.nome + "\t CPF (" + this.getCpf() + " ) \t";
		cliente += "- Tel: {" + this.getTelefone() + "}";
		return cliente;
	}
}
