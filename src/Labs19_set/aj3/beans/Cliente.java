/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package Labs19_set.aj3.beans;

public class Cliente implements Comparable{

	private String nome;
	private String telefone;
	private String cpf;
	private int id;

	public Cliente(String nome, String telefone, String cpf, int id) {
		this(nome, telefone, cpf);
		this.setId(id);
	}

	public Cliente(String nome, String telefone, String cpf) {
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setCpf(cpf);
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		String cliente = " ID [" + this.getId() + "]";
		cliente += this.nome + "\t CPF (" + this.getCpf()+ " ) \t";
		cliente += "- Tel: {" + this.getTelefone() + "}";
		return cliente;
	}

	/*
	 * Para verificar que elementos repetidos nao podem ser inseridos no TreeSet
	 * descomente o metodo hashCode e o metodo equals
	 */

	/*
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}
	

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	*/

	@Override
	public int compareTo(Object o) {
		
		Cliente cliente = (Cliente) o;
		return this.getCpf().compareTo(cliente.getCpf());
		
	}
	

}
