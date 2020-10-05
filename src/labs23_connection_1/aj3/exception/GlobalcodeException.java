package labs23_connection_1.aj3.exception;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
public class GlobalcodeException extends Exception {

	public GlobalcodeException(String mensagem, Exception e) {
		super(mensagem, e);
	}

	public GlobalcodeException(String mensagem) {
		super(mensagem);
	}
}
