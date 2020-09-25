package laboratorio7.java;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Conta 
 * 2) Inicialize todos os atributos deste objeto 
 * 3) Imprima os valores dos atributos da classe Conta de forma a obter o seguinte resultado:
 * 
 * ----------------------------- 
 * AGENCIA: 1 BANCO : 234 
 * NUMERO : 01945 
 * TITULAR: Globalcode 
 * SALDO : R$10000.0
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaConta {

    public static void main(String[] args) {
    	Conta conta = new Conta();
    	Agencia agencia = new Agencia();
    	
    	agencia.setBanco(0001);
    	agencia.setNumero(3012);
    	
    	conta.setAgencia(agencia);
    	conta.setNumero(1458745);
    	conta.setSaldo(200);
    	conta.setTitular("Gabriel Artioli");
    	
    	System.out.println("-----------------------------");
    	System.out.println("AGENCIA: " + conta.getAgencia().getNumero() + '\t' + "BANCO: " + conta.getAgencia().getBanco());
    	System.out.println("NUMERO: " + conta.getNumero());
    	System.out.println("TITULAR: " + conta.getTitular());
    	System.out.println("SALDO: " + conta.getSaldo());
    	System.out.println("-----------------------------");
    }
}
