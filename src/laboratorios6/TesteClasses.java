package laboratorios6;

public class TesteClasses {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Agencia agencia = new Agencia();
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		
		banco.nome = "Nubank";
		banco.numero = 256;
		
		agencia.banco = banco;
		agencia.nome = "Agencia nomezinho";
		agencia.numero = 0125;
		
		cliente.nome = "Gabriel Artioli";
		cliente.cpf = "4795624871";
		
		conta.numero = 1254789;
		conta.saldo = 100;
		conta.agencia = agencia;
		conta.cliente = cliente;
		
		System.out.println("Dados: ");
		conta.cliente.imprimir();
		conta.imprimir();
		conta.agencia.imprimir();
		conta.agencia.banco.imprimir();
		System.out.println();
		
		conta.saque(500);
		conta.deposito(500);
		conta.saque(500);
		conta.deposito(-200);
	}

}
