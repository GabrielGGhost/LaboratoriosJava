package lab12_asbtract_2;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
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

    public void imprimeDados() {
        System.out.println("========================================");
        System.out.println("CONTA ESPECIAL");
        System.out.println("Limite de R$ " + this.getLimite());
        super.imprimeDados();
    }

    public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + this.getNumero());
        if (valor > 0) {
            if ((this.getSaldo() + this.getLimite())>= valor) {
                this.setSaldo(this.getSaldo() - valor);
                acumularIFN(valor);
            } else
                System.out.println("Saldo insuficiente");
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
