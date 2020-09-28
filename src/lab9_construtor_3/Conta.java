package lab9_construtor_3;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
public class Conta {

    private double saldo;
    private String numero;
    private String titular;
    private String agencia;
    private int banco;
    private double ifn;
    private static double taxaIFN = 0.038;

	public Conta(double saldoInicial, String num, String tit, String ag, int bc) {
    	
        this(num, tit, ag, bc);
        this.setSaldo(saldoInicial);
    }

    public Conta(String num, String tit, String ag, int bc) {
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
                this.setIfn(this.getIfn() + this.getSaldo() * Conta.getTaxaIFN());
            } else
                System.out.println("Saldo insuficiente");
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }

    public void deposito(double valor) {
        System.out.println("Realizando deposito de R$" + valor + " da conta " + numero);
        if (valor >= 0)
            this.saldo += valor;
        else
            System.out.println("O valor do deposito deve ser positivo");
    }

    public void imprimeDados() {
        System.out.println("\n----------------------------");
        System.out.println(" AGENCIA:" + agencia);
        System.out.println(" NUMERO : " + numero);
        System.out.println(" TITULAR: " + titular);
        System.out.println(" SALDO  : R$" + saldo);
        System.out.println("-----------------------------\n");
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getBanco() {
        return banco;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public void setBanco(int banco) {
        this.banco = banco;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    
    public double getIfn() {
		return ifn;
	}

	public void setIfn(double ifn) {
		this.ifn = ifn;
	}
	
	public static double getTaxaIFN() {
		return taxaIFN;
	}

	public static void setTaxaIFN(double taxaIFN) {
		Conta.taxaIFN = taxaIFN;
	}

}
