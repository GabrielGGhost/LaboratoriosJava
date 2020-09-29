package labs14_exception;


public class Investimento implements Tributavel {

    private double valorAplicado;
    private double rendimentoMensal;
    private int meses;
    private static double taxaIR = 0.27; 
    
    public Investimento(double valorAplicado, double rendimentoMensal, int meses) {
        this.setValorAplicado(valorAplicado);
        this.setRendimentoMensal(rendimentoMensal);
        this.setMeses(meses);
    }
    
    public void setValorAplicado(double valorAplicado) {
		this.valorAplicado = valorAplicado;
	}

	public void setRendimentoMensal(double rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public static void setTaxaIR(double taxaIR) {
        Investimento.taxaIR = taxaIR;
    }

    public static double getTaxaIR() {
        return Investimento.taxaIR;
    }

    
    public int getMeses() {
        return this.meses;
    }

    
    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    
    public double getValorAplicado() {
        return valorAplicado;
    }

    public double getRendimentoBruto() {
        double rendimentoAcumulado = Math.pow(1 + rendimentoMensal, meses);
        return valorAplicado * (rendimentoAcumulado - 1);
    }
    
    public double getRendimentoLiquido() {
        return getRendimentoBruto() * (1 - taxaIR);        
    }
    
    public String getDescricaoTributavel() {
        return "Fundo de Investimento";
    }

    public String getNomeImposto() {
        return "Imposto de Renda";
    }

    public double calcularImpostos() {
        return getRendimentoBruto() * taxaIR;
    }
    

    
}
