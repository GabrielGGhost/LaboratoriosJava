package labs13_exceptions;

public class TesteRuntimeExceptions {

    public static void main(String[] args) {
        // Leitura do parametro digitado pelo usuario como parametro do main
    	try {
            String parametro1 = args[0];
            int numero = Integer.parseInt(parametro1);
            System.out.println(numero);
    	} catch (Exception e) {
    		System.out.println("Parâmetros inváldos informados!");
    	}
    }
}
