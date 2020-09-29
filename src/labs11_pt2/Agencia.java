package labs11_pt2;

import java.util.Random;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Implemente o metodo abrirConta seguindo como modelo o metodo 
 * abrirAgencia da classe Banco. Para isto sera necessario criar os
 * atributos e alterar o construtor conforme foi feito na classe Banco.
 * 
 * 2) Depois de alterar o construtor sera necessario alterar na classe 
 * Banco o metodo abrirAgencia para chamar o construtor valido, ou seja,
 * informando o numero de contas que a agencia podera abrir, utilize um 
 * valor fixo, por exemplo 10.
 *  
 * 3) Crie um metodo que faca a impressao das contas que estao dentro da
 * agencia usando como modelo o metodo imprimirAgencias que esta na classe Banco.
 * 
 */
public class Agencia {

    private String numero;
    private Banco banco;
    private Conta[] contas;
    private int numContasAbertas;
    private static int proximaConta = 10000;

	public Agencia(String num, Banco bc, int maximoContas) {
        this.setNumero(num);
        this.setBanco(bc);
        this.setContas(new Conta[maximoContas]);
    }
    
	public Conta abrirConta(double saldoInicial, Cliente titular) {
   	
        Conta c = new Conta(saldoInicial, Integer.toString(Agencia.getProximaConta() + 1), titular, this);
        Agencia.setProximaConta(Agencia.getProximaConta() + 1);
        boolean contaAdicionada = adicionarArrayConta(c);
        if (contaAdicionada) {
            return c;
        } else {
            return null;
        }
        
    }
    
    private boolean adicionarArrayConta(Conta c) {
        if (this.getContas().length <= this.getNumContasAbertas()) {
            System.out.println("Banco ERROR: Nao foi possivel criar uma nova conta");
            return false;
        } else {
            System.out.println("Conta adicionada ao array " + this.getNumContasAbertas());
            this.getContas()[this.getNumContasAbertas()] = c;
            this.setNumContasAbertas(this.getNumContasAbertas() + 1);
            return true;
        }
    }
    
    public void imprimirContas() {
        System.out.println("\n\n=============== RELATORIO DE CONTAS DA AGENCIA ==================\n");
        System.out.println("Numero de contas abertas: " + this.getNumContasAbertas());
        for (int i = 0; i < this.getNumContasAbertas(); i++) {
            this.contas[i].imprimeDados();
        }
        System.out.println("===============================================");
    }
    
    public int getNumContasAbertas() {
		return numContasAbertas;
	}

	public void setNumContasAbertas(int numContasAbertas) {
		this.numContasAbertas = numContasAbertas;
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}

    public Banco getBanco() {
        return banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setBanco(Banco b) {
        banco = b;
    }

    public void imprimeDados() {
        System.out.println("\nAgencia no. " + numero);
        banco.imprimeDados();
    }

    public void setNumero(String num) {
        numero = num;
    }
    
	public static int getProximaConta() {
		return proximaConta;
	}

	public static void setProximaConta(int proximaConta) {
		Agencia.proximaConta = proximaConta;
	}
}