package lab9_construtor_2;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Crie um construtor para cada metodo inicializaConta da classe Conta e remova os metodos inicializaConta
 */
public class Conta {

    private double saldo;
    private String numero;
    private String titular;
    private String agencia;
    private int banco;
    
    Conta(double saldoInicial, String num, String tit, String ag, int bc){
    	this.setSaldo(saldoInicial);
    	this.setNumero(num);
    	this.setTitular(tit);
    	this.setAgencia(ag);
    	this.setBanco(bc);
    }
    
    Conta(String num, String tit, String ag, int bc){
        this(0, num, tit, ag, bc);
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
        if (valor >= 0)
            this.setSaldo(this.getSaldo() + valor);
        else
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

    public String getAgencia() {
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
}
