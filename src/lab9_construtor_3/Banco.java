package lab9_construtor_3;
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
        return this.nome;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int num) {
        this.numero = num;
    }

    public void imprimeDados() {
        System.out.println("Banco: " + this.getNome() + "\tNumero do banco " + this.getNumero());
    }
}
