package lab6_classes;

public class TesteClasses {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Agencia agencia = new Agencia();
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		
		banco.inicializarBanco("Nubank", 0001);
		
		agencia.inicializarAgencia(0125, "Agencia nomezinho", banco);
		
		cliente.inicializarCliente("Gabriel Artioli", "478569523-00");

		conta.inicializarConta(100, 1452365, agencia, cliente);
		
		conta.saque(500);
		conta.deposito(500);
		conta.saque(500);
		conta.deposito(-200);
		
		conta.imprimir();
		

	}

}
