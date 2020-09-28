package lab7_metodos_3;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
/**
 * @author Globalcode
 * 
 */
public class TestaCliente {

    public static void main(String[] args) {
        // Criacao do cliente
        // Inicializacao do cliente usando o metodo inicializaCliente
        // Impressao dos dados do cliente
    	
    	Cliente c = new Cliente();
    	c.inicializaCliente("Fabio Evangelista","44598758-0");
    	c.imprimeDados();
    }
}
