package lab8_sobrecarga;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Nao e necessario fazer nenhuma alteracao nesta classe
 */
public class Agencia {

    private int numero;
    private Banco banco;

    public Banco getBanco() {
        return banco;
    }

    public int getNumero() {
        return numero;
    }

    public void inicializaAgencia(int num, int bc, Banco banco) {
        this.setNumero(num);
        this.setBanco(banco);
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Banco: " + this.getBanco().getNome());
        System.out.println("Agencia no. " + this.getNumero());
        System.out.println("Banco no." + this.getBanco().getNumero());
        System.out.println("----------------------");
    }
}
