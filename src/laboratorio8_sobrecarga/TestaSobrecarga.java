package laboratorio8_sobrecarga;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Execute esta classe para testar a sobrecarga do metodo inicializaConta da classe
 * Conta 
 *
 */
public class TestaSobrecarga {

    public static void main(String[] args) {
        // 1. Instanciar uma Conta c1
        // 2. Chame o metodo inicializaConta informando o saldo
        // 3. Imprima os dados da Conta, usando o metodo imprimeDados
        // 4. Instanciar uma Conta c2
        // 5. Chame o metodo inicializaConta informando sem informar o saldo
        // 6. Imprima os dados da Conta c2, usando o metodo imprimeDados
    	
    	Conta c1 = new Conta();
    	Agencia agencia = new Agencia();
    	Banco banco = new Banco();
    	
    	banco.inicializarBanco("Nubank", 0001);
    	agencia.inicializaAgencia(145236, 2255, banco);
    	
    	c1.inicializaConta(100, 125632, "Gabriel Artioli", agencia);
    	c1.imprimeDados();
    }
}
