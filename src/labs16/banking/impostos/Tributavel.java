/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
package labs16.banking.impostos;

public interface Tributavel {
	public String getDescricaoTributavel();

	public String getNomeImposto();

	public double calcularImpostos();
}
