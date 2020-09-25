package lab9_construtor;

public class Agencia {

    private int numero;
    private Banco banco;


    public Agencia(int numero, Banco banco) {
        this.setNumero(numero);
        this.setBanco(banco);
    }

    public Banco getBanco() {
        return this.banco;
    }


    public int getNumero() {
        return this.numero;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setNumero(int num) {
        numero = num;
    }

    public void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Agencia no. " + this.getNumero());
        System.out.println("Banco no." + this.getBanco());
        System.out.println("----------------------");
    }
}
