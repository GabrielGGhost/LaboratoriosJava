package lab7_metodos_3;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * As seguintes alteracoes foram feitas para encapsulamento dos atributos da classe Conta:
 * - Todos os atributos tem o modificador de acesso private, ou seja, nao poderao ser 
 * alterados diretamente, somente atraves de metodos da propria classe 
 * - Nao e necessario criar setter para o saldo, pois este atributo esta encapsulado 
 * pelos metodos saque(double valor), deposito(double valor) e getSaldo().
 * - Nao e necessario criar os metodos setNumero(), setAgencia(), setBanco(), 
 * estes valores podem ser passados apenas na inicializacao do objeto, na chamada ao metodo
 * inicializaConta().
 * 
 * Analise o codigo abaixo.
 */
public class Conta {

    private double saldo;
    private String numero;
    private String titular;
    private int agencia;
    private int banco;


    public void inicializaConta(double saldoInicial, String num, String tit, int ag, int bc) {
        this.setSaldo(saldoInicial);
        this.setNumero(num);
        this.setTitular(tit);
        this.setAgencia(ag);
        this.setBanco(bc);
    }

	public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + this.getNumero());
        if (valor > 0) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
            } else
                System.out.println("Saldo insuficiente");
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }

    public void deposito(double valor) {
        System.out.println("Realizando deposito de R$" + valor + " da conta " + this.getNumero());
        if (valor >= 0) {
            this.setSaldo(this.getSaldo() + valor);
        } else
            System.out.println("O valor do deposito deve ser positivo");
    }

    public void imprimeDados() {
        System.out.println("\n----------------------------");
        System.out.println(" AGENCIA:" + this.getAgencia());
        System.out.println(" NUMERO : " + this.getNumero());
        System.out.println(" TITULAR: " + this.getTitular());
        System.out.println(" SALDO  : R$" + this.getSaldo());
        System.out.println("-----------------------------\n");
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getBanco() {
        return this.banco;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}
}
