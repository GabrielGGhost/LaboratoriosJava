package lab9_construtor_3;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Nao e necessario fazer nenhuma alteracao nesta classe
 */
public class Agencia {

    private String numero;
    private int banco;

    public Agencia(String numero, int banco) {
        this.setNumero(numero);
        this.setBanco(banco);
    }

    public int getBanco() {
        return this.banco;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setBanco(int b) {
        this.banco = b;
    }

    public void setNumero(String num) {
        this.numero = num;
    }

    public void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Agencia no. " + this.getNumero());
        System.out.println("Banco no." + this.getNumero());
        System.out.println("----------------------");
    }
}
