package lab10_heranca;

public class ContaEspecial extends Conta{
	
	private double limite;
	
	
	public ContaEspecial(double limite, double saldoInicial, String num, Cliente tit, Agencia ag) {
		super(saldoInicial, num, tit, ag);
		this.setLimite(limite);
	}
	
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
    public void imprimeDados() {
        System.out.println("======================================");
        this.getAgencia().imprimeDados();
        System.out.println("Numero da conta: " + this.getNumero());
        this.getTitular().imprimeDados();
        System.out.println("Saldo : R$" + this.getSaldo());
        System.out.println("Limite: R$" + this.getLimite());
        System.out.println("Tipo da conta: Especial");
        System.out.println("IFN devido: R$" + this.getAcumuladorIFN());
        System.out.println("========================================");
    }
    
    public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + this.getNumero());
        if (valor > 0) {
            if (this.getSaldo() + this.getLimite() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                if(this.getSaldo() < 0) {
                	this.setLimite(this.getLimite() - Math.abs(this.getSaldo()));
                	this.setSaldo(0);
                }
                super.acumularIFN(valor);
            } else
                System.out.println("Saldo insuficiente");
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }
}
