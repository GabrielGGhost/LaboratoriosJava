package laboratorio6;

public class Conta {

	double saldo;
	int numero;
	Agencia agencia;
	Cliente cliente;
	
	void imprimir() {
		System.out.println("Saldo da conta: " + saldo);
		System.out.println("Número da conta: " + numero);
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
