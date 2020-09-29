package labs14_exception;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 *      
 */
public class AgenciaPlus extends Agencia {

    private double saldoMinimo;
    private double saldoMaximo;
    
    public AgenciaPlus(String num, Banco bc, double saldoMinimo, double saldoMaximo) {
        super(num, bc);
        this.setSaldoMinimo(saldoMinimo);
        this.setSaldoMaximo(saldoMaximo);
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
    
    // solucao
    protected void ajustarLimiteIndividual(ContaEspecial contaEspecial) {
        if (contaEspecial.getSaldo() < this.getSaldoMinimo()) {
            contaEspecial.setLimite(contaEspecial.getLimite() * .75);
        } else if (contaEspecial.getSaldo() > this.getSaldoMaximo()) {
            contaEspecial.setLimite(contaEspecial.getLimite() * 1.25);
        }
    }
}
