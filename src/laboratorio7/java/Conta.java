package laboratorio7.java;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Adicione os seguintes atributos na classe Conta: 
 * - saldo (double) 
 * - numero (String) 
 * - titular (String) 
 * - agencia (int) 
 * - banco (int)
 */
class Conta {
	
	private double saldo;
	private int numero;
	private String titular;
	private Agencia agencia;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	void inicializarConta(double saldo, int numero, String titular, Agencia agencia) {
	
		this.setSaldo(saldo);
		this.setNumero(numero);
		this.setTitular(titular);
		this.setAgencia(agencia);
	}
	
	void inicializarConta(int numero, String titular, Agencia agencia) {
		
		this.setSaldo(saldo);
		this.setNumero(numero);
		this.setTitular(titular);
		this.setAgencia(agencia);
	}
	
	
}
