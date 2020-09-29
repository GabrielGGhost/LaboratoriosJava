package labs14_exception;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
public class ContaPoupanca extends Conta {

    private String dataAniversario;

    public ContaPoupanca(double saldoInicial, String num, Cliente tit, Agencia ag, String dataAniversario) {
        super(saldoInicial, num, tit, ag);
       this.setDataAniversario(dataAniversario);
    }

    public ContaPoupanca(String num, Cliente tit, Agencia ag, String dataAniversario) {
        super(num, tit, ag);
        this.setDataAniversario(dataAniversario);
    }

    public String getDataAniversario() {
        return this.dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public void imprimeDados() {
        System.out.println("\n ============ CONTA POUPANCA ====================");
        getAgencia().imprimeDados();
        System.out.println("Numero da conta: " + this.getNumero());
        System.out.println("Data de aniversario: " + this.getDataAniversario());
        getTitular().imprimeDados();
        System.out.println("Saldo  : R$" + this.getSaldo());
        System.out.println("========================================\n");
    }

}
