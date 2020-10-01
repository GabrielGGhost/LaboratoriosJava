package Labs19_set.aj3.teste;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Labs19_set.aj3.beans.Cliente;

public class TesteTreeSet {
	public static void main(String args[]) {
		Cliente c1 = new Cliente("Cliente1", "1111", "cpf1");
		Cliente c2 = new Cliente("Cliente2", "2222", "cpf2");
		Cliente c3 = new Cliente("Cliente3", "3333", "cpf3");
		Cliente c4 = new Cliente("Cliente3", "3333", "cpf3");

		// Defina a colecao do tipo TreeSet
		Set clientes = new TreeSet();

		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);

		Iterator ponteiroClientes = clientes.iterator();
		while (ponteiroClientes.hasNext()) {
			System.out.println(ponteiroClientes.next());
		}
	}
}

//3-Clientes com o mesmo cpf foram armazenados no SET? Por que?
//N�o, mesmo com os m�todos hashCode e equals desativados n�o foram repetidos dados gra�as ao treeSet, que implementa um sortedSet

//4-Qual a ordem em que os clientes foram impressom? H� uma ordem?
//N�o h� uma ordem espec�fica, pois os hashSet n�o tem uma ordem na varredura ou impress�o, a ordem de entrada n�o � a mesma da sa�da