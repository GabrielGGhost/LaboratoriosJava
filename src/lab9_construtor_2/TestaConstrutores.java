package lab9_construtor_2;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores {

    public static void main(String[] args) {
    	
    	Conta c1 = new Conta("0024", "Tudela", "1212", 4521);
    	Conta c2 = new Conta(240, "44785", "Fábio", "44785", 1145);
    	
    	c1.imprimeDados();
    	c2.imprimeDados();
    	
    	Cliente c = new Cliente("Tudela",  "445879");
    	c.imprimeDados();
    	
    }
}
