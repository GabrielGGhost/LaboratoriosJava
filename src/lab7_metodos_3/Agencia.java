package lab7_metodos_3;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Encapsule os atributos da classe Agencia = tornar os atributos privados e criar getters e setters
 * 
 */
public class Agencia {

    private String numero;
    private int banco;

    public void inicializaAgencia(String num, int bc) {
    	this.setNumero(num);
        this.setBanco(bc);
    }

    public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Agencia no. " + this.getNumero());
        System.out.println("Banco no." + this.getBanco());
        System.out.println("----------------------");
    }
}
