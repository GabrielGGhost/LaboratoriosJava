package lab9_construtor_1;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores {

    public static void main(String[] args) {
    	
    	Banco banco = new Banco("Picpay", 1025);
    	Agencia agencia = new Agencia(1145, banco);
    	Conta conta1 = new Conta(500, 144584, "Gabriel Artioli", agencia);
    	Conta conta2 = new Conta(122547, "Rosana Almeida", agencia);
    	Cliente cliente = new Cliente("Gabriel Artioli", "445588966-0");
    	
    	
    	conta1.imprimeDados();
    	conta2.imprimeDados();
    
    	cliente.imprimeDados();
    }
}
