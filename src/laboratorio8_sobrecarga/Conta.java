package laboratorio8_sobrecarga;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Sobrecarregue o metodo inicializaConta permitindo que ele 
 * seja executado sem informar o saldo, e neste caso o saldo inicial
 * devera ser 0.
 * 
 */
public class Conta {

    private double saldo;
    private int numero;
    private String titular;
    private Agencia agencia;
    //private int banco;

    public void inicializaConta(double saldoInicial, int num, String tit, Agencia ag/*int bc*/) {
        this.saldo = saldoInicial;
        this.numero = num;
        this.titular = tit;
        this.agencia = ag;
        //this.banco = bc;
    }
    
    public void inicializaConta(int num, String tit, Agencia ag/*, int bc*/) {
        this.saldo = 0;
        this.numero = num;
        this.titular = tit;
        this.agencia = ag;
        //this.banco = bc;
    }

    public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + numero);
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
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
        System.out.println(" BANCO: " + this.getAgencia().getBanco().getNome());
        System.out.println(" AGENCIA: " + this.getAgencia().getNumero());
        System.out.println(" NUMERO : " + this.getNumero());
        System.out.println(" TITULAR: " + this.getTitular());
        System.out.println(" SALDO  : R$" + this.getSaldo());
        System.out.println("-----------------------------\n");
    }

    public double getSaldo() {
        return this.saldo;
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
