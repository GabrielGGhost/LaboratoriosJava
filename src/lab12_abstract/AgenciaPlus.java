package lab12_abstract;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Analise os atributos e o construtor desta classe
 *  
 * 2) Sobrescreva o metodo abstrato ajustarLimiteIndividual herdado da classe Agencia 
 *    de acordo com as seguintes regras de negocio:
 *    
 *    a) se o saldo estiver abaixo do saldoMinimo o limite deve ser ajustado em -25%
 *    b) se o saldo estiver acima do saldoMaximo o limite deve ser ajustado em +25%
 *      
 */
public class AgenciaPlus extends Agencia {

    private double saldoMinimo;
    private double saldoMaximo;
    
    public AgenciaPlus(String num, Banco bc, double saldoMinimo, double saldoMaximo) {
        super(num, bc);
        this.setSaldoMaximo(saldoMaximo);
        this.setSaldoMaximo(saldoMaximo);
    }
    
    protected void ajustarLimiteIndividual(ContaEspecial contaEspecial) {
    	
    	if(contaEspecial.getSaldo() < this.getSaldoMaximo()) {
    		contaEspecial.setLimite(contaEspecial.getLimite()  - (contaEspecial.getLimite() * 0.25));
    	} else if (contaEspecial.getSaldo() > this.saldoMaximo) {
    		contaEspecial.setLimite(contaEspecial.getLimite()  + (contaEspecial.getLimite() * 0.25));
    	}
    }
    
    
    public double getSaldoMaximo() {
        return this.saldoMaximo;
    }

    public void setSaldoMaximo(double saldoMaximo) {
        this.saldoMaximo = saldoMaximo;
    }
    
    public double getSaldoMinimo() {
        return this.saldoMinimo;
    }
    
    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    

}
