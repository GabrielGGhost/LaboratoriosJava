/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * Esta e uma interface que especifica metodos para obtençao e armazenamento de clientes,
 * nao importando onde estes objetos serao persistidos, ex: arquivo, collections, 
 * banco de dados, etc...
 * 
 */
package labs24_connection_2.aj3.dao;

import java.util.List;

import labs24_connection_2.aj3.beans.Cliente;
import labs24_connection_2.aj3.exception.GlobalcodeException;


public interface IClientesDAO {

	public abstract void salvar(Cliente cliente) throws GlobalcodeException;


	public abstract void excluir(String cpf) throws GlobalcodeException;

	public abstract List getAllClientes() throws GlobalcodeException;

	public abstract Cliente getClienteByCPF(String cpf)	throws GlobalcodeException;
}