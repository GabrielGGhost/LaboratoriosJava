/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
package labs17.aj3.er;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import labs17.aj3.util.Teclado;

public class TesteExpressaoRegular {
	public static void main(String args[]) {
		String nome, telefone;

		System.out.println("Nome: ");
		nome = Teclado.le();

		System.out.println("Telefone: ");
		telefone = Teclado.le();

		if (validaNome(nome) && validaTelefone(telefone)) {
			System.out.println("Nome: " + nome);
			System.out.println("Telefone: " + telefone);
		} else {
			System.out.println("Nome deve de 5 a 20 caracteres entre letras e espacos.");
			System.out.println("Telefone deve estar no formato: (xx)xxxx-xxxx");
		}
	}

	public static boolean validaNome(String nome) {
		Pattern padrao = Pattern.compile("[A-Za-z ]{5,20}");
		Matcher matcher = padrao.matcher(nome);
		boolean r = matcher.matches();
		return r;
	}

	public static boolean validaTelefone(String telefone) {
		Pattern padrao = Pattern.compile("^\\(?[1-9]{2}\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$");
		Matcher matcher = padrao.matcher(telefone);
		return matcher.matches();
	}
}
