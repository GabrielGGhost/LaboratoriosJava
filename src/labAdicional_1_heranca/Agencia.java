package labAdicional_1_heranca;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
public class Agencia {

    private String numero;
    private Banco banco;

    public Agencia(String num, Banco bc) {
        this.setNumero(num);
        this.setBanco(bc);
    }

    public Banco getBanco() {
        return this.banco;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setBanco(Banco b) {
        this.banco = b;
    }

    public void setNumero(String num) {
        this.numero = num;
    }
    
    public void imprimeDados() {
        System.out.println("Agencia no. " + this.getNumero());
        this.getBanco().imprimeDados();
    }

}