package lab11_cast_polimorfismo;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Altere a classe Agencia utilizando associaçao de classes: 
 * 1) Substitua o atributo banco, do tipo int, por um atributo banco do tipo Banco 
 * 2) Altere os metodos que julgar necessario
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

    public void imprimeDados() {
        System.out.println("Agencia no. " + this.getNumero());
        System.out.println("Banco no. " + this.getBanco().getNome());
    }

    public void setNumero(String num) {
        this.numero = num;
    }
}