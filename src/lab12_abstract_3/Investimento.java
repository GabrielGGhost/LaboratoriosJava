package lab12_abstract_3;


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
    
    public void setRendimentoMensal(double rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public void setValorAplicado(double valorAplicado) {
		this.valorAplicado = valorAplicado;
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
        return this.rendimentoMensal;
    }

    
    public double getValorAplicado() {
        return this.valorAplicado;
    }

    public double getRendimentoBruto() {
        double rendimentoAcumulado = Math.pow(1 + this.getRendimentoMensal(), this.getMeses());
        return valorAplicado * (rendimentoAcumulado - 1);
    }
    
    public double getRendimentoLiquido() {
        return this.getRendimentoBruto() * (1 - Investimento.taxaIR);        
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
