package laboratorio6;

public class Conta {

	double saldo;
	int numero;
	Agencia agencia;
	Cliente cliente;
	
	void inicializarConta(double saldo, int numero, Agencia agencia, Cliente cliente) {
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
	}
	
	void imprimir() {
		System.out.println();
		System.out.println("Dados: ");
		this.cliente.imprimir();
		this.agencia.imprimir();
		this.agencia.banco.imprimir();
		System.out.println();
	}
	
	void saque(double valor) {
		
		if(valor > saldo) {
			System.out.println("Valor de saque insuficiente!");
		} else {
			saldo -= valor;
			System.out.println("Novo saldo: " + saldo);
		}
		
	}
	
	void deposito(double valor) {
		
		if(valor >= 0) {
			saldo += valor;	
			System.out.println("Novo saldo: " + saldo);
		} else {
			System.out.println("Valor de depósito inválido");
		}
		
	}
}
