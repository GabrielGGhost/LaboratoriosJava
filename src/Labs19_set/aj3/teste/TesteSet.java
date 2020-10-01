package Labs19_set.aj3.teste;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import Labs19_set.aj3.beans.Cliente;

public class TesteSet {

	public static void main(String args[]) {
		Cliente c1 = new Cliente("Cliente1", "1111", "cpf1", 1);
		Cliente c2 = new Cliente("Cliente2", "2222", "cpf2", 2);
		Cliente c3 = new Cliente("Cliente3", "3333", "cpf3", 3);
		Cliente c4 = new Cliente("Cliente4", "4444", "cpf3", 4);
		Cliente c5 = new Cliente("Cliente5", "5555", "cpf1", 5);
		Cliente c6 = new Cliente("Cliente6", "6666", "cpf4", 6);
		Cliente c7 = new Cliente("Cliente7", "7777", "cpf4", 7);

		Set clientes = new HashSet();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		clientes.add(c5);
		clientes.add(c6);
		clientes.add(c7);


		Iterator ponteiroClientes = clientes.iterator();
		while (ponteiroClientes.hasNext()) {
			System.out.println(ponteiroClientes.next());
		}
	}
}

//1-Clientes com o mesmo cpf foram armazenados no SET? Por que?
//Sim, porque embora eles tenham o mesmo cpf, os metodos que impedem eles de repetirem estavam desativados

//2-Qual a ordem em que os clientes foram impressom? Há uma ordem?
//Não há uma ordem específica, pois os hashSet não tem uma ordem na varredura ou impressão, a ordem de entrada não é a mesma da saída
//Para manter uma ordem é preciso usar o LinkedHashSet

//3-Clientes com o mesmo cpf foram armazenados no SET? Por que?
//Não, após a ativação dos métodos hashCode e equals passa a ser verificado os valores repetidos e são ignorados

//4-Qual a ordem em que os clientes foram impressom? Há uma ordem?
//Não há uma ordem específica, pois os hashSet não tem uma ordem na varredura ou impressão, a ordem de entrada não é a mesma da saída

