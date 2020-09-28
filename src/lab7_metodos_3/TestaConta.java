package lab7_metodos_3;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaConta {

    public static void main(String[] args) {
        // Criar um objeto do tipo Conta
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
        // executar um deposito
        // Imprimir o saldo apos o deposito
        // executar um saque cujo valor seja menor que o saldo
        // Imprimir o saldo apos o deposito
        // executar uma retirada cujo valor seja maior que o saldo
        // Imprimir o saldo apos o deposito
    	
    	Conta c = new Conta();
    	c.inicializaConta(25, "44587", "Fábio Evangelista", 0005, 1125);

    	c.imprimeDados();
    	
    	c.deposito(120);
    	c.imprimeDados();
    	    	
    	c.saque(10);
    	c.imprimeDados();
    	
    	
    	c.saque(800);
    	c.imprimeDados();
    	
    }
}
