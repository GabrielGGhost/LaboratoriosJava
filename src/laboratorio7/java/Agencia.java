package laboratorio7.java;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Adicione os seguintes atributos na classe Agencia:
 * - numero (String)  
 * - banco (int) 
 */
class Agencia {
	
	private int banco;
	private int numero;
	
	public int getBanco() {
		return banco;
	}
	public void setBanco(int banco) {
		this.banco = banco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	void inicializarAgencia(int numero, int banco) {
		this.setNumero(numero);
		this.setBanco(banco);
	}
	
	void imprimir() {
		
    	System.out.println("-------------------------------");
    	System.out.println("AGENCIA: " + this.getNumero() + '\t' + "BANCO: " + this.getBanco());
    	System.out.println("-------------------------------");   
    	
	}
}
