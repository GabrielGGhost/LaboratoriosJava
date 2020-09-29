package labs14_exception;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(double saldoInicial, String num, Cliente tit, Agencia ag, double limite) {
        super(saldoInicial, num, tit, ag);
        this.setLimite(limite);
    }

    public ContaEspecial(String num, Cliente tit, Agencia ag, double limite) {
        super(num, tit, ag);
        this.setLimite(limite);
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + this.getNumero());
        if (valor > 0) {
            if (this.getSaldo() + limite >= valor) {
                this.setSaldo(this.getSaldo() + valor);
                acumularIFN(valor);
            } else
                System.out.println("Saldo e limite insuficientes");
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }

    public void imprimeDados() {
        System.out.println("\n===========CONTA ESPECIAL ===========================");
        getAgencia().imprimeDados();
        System.out.println("Numero da conta: " + getNumero());
        getTitular().imprimeDados();
        System.out.println("Saldo  : R$" + this.getSaldo());
        System.out.println("Limite : R$" + this.getLimite());
        System.out.println("TOTAL  : R$" + (this.getSaldo() + this.getLimite()));
        System.out.println("========================================\n");
    }
}
