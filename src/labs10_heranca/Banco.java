package labs10_heranca;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
public class Banco {

    private String nome;
    private int numero;

    public Banco(String nome, int numero) {
        this.setNome(nome);
        this.setNumero(numero);
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int num) {
        this.numero = num;
    }

    public void imprimeDados() {
        System.out.println("Banco: " + nome + "\tNumero do banco " + this.getNumero());
    }

}