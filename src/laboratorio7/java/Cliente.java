package laboratorio7.java;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Adicione os seguintes atributos na classe Cliente: 
 * - nome (String) 
 * - cpf (String)
 */
class Cliente {
	
	private String nome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	void inicializarCliente(String nome, String cpf) {
		this.setNome(nome);
		this.setCpf(cpf);
	}
	
	void imprimir() {
    	System.out.println("--------------------------------------------------");
    	System.out.println("Nome: " + this.getNome() + "\t" + "CPF: " + this.getCpf());
    	System.out.println("--------------------------------------------------");
	}
	
}
