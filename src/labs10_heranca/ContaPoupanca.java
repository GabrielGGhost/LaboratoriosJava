package labs10_heranca;

public class ContaPoupanca extends Conta{
	
	private String dataAniversario;
	
	public void imprimeDados() {
		System.out.println("======================================");
		System.out.println("Data de aniversário: " + this.getDataAniversario());
		this.getAgencia().imprimeDados();
	    System.out.println("Numero da conta: " + this.getNumero());
	    this.getTitular().imprimeDados();
	    System.out.println("Saldo : R$" + this.getSaldo());
	    System.out.println("Tipo da conta: Poupança");
	    System.out.println("IFN devido: R$" + this.getAcumuladorIFN());
	    System.out.println("========================================");
	}
	
	ContaPoupanca(String dataAniversario, double saldoInicial, String num, Cliente tit, Agencia ag){
		super(saldoInicial, num, tit, ag);
		this.setDataAniversario(dataAniversario);
	}
	
	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
}
