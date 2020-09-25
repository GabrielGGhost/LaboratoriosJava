package lab9_construtor;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Crie um construtor para cada metodo inicializaConta da classe Conta e remova os metodos inicializaConta
 */
public class Conta {

    private double saldo;
    private int numero;
    private String titular;
    private Agencia agencia;
    //private int banco;

    //public void inicializaConta(double saldoInicial, String num, String tit, String ag, int bc) {
    //    saldo = saldoInicial;
    //    numero = num;
    //    titular = tit;
    //    agencia = ag;
    //    banco = bc;
    //}
    
    Conta(double saldo, int numero, String titular, Agencia agencia){
    	this.setSaldo(saldo);
    	this.setNumero(numero);
    	this.setTitular(titular);
    	this.setAgencia(agencia);
    }

    //public void inicializaConta(String num, String tit, String ag, int bc) {
    //    this.inicializaConta(0, num, tit, ag, bc);
    //}
    
    Conta(int numero, String titular, Agencia agencia){
    	this(0, numero, titular, agencia);
    }

    public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + this.getNumero());
        if (valor > 0) {
            if (this.getSaldo() >= valor) {
                this.setSaldo((this.getSaldo()) - valor);
            } else
                System.out.println("Saldo insuficiente");
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }


    public void deposito(double valor) {
        System.out.println("Realizando deposito de R$" + valor + " da conta " + numero);
        if (valor >= 0)
            this.setSaldo(this.getSaldo() + valor);
        else
            System.out.println("O valor do deposito deve ser positivo");
    }


    public void imprimeDados() {
        System.out.println("\n----------------------------");
        System.out.println(" AGENCIA: " + this.getAgencia().getNumero());
        System.out.println(" NUMERO : " + this.getNumero());
        System.out.println(" TITULAR: " + this.getTitular());
        System.out.println(" SALDO  : R$" + this.getSaldo());
        System.out.println("-----------------------------\n");
    }


    public double getSaldo() {
        return saldo;
    }


    public Agencia getAgencia() {
        return agencia;
    }

    //public int getBanco() {
    //    return banco;
    //}
    
    public int getNumero() {
        return numero;
    }


    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    //public void setBanco(int banco) {
    //    this.banco = banco;
    //}

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
