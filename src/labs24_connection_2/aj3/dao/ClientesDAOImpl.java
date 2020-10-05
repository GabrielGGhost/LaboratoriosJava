/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package labs24_connection_2.aj3.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import labs24_connection_2.aj3.beans.Cliente;
import labs24_connection_2.aj3.exception.GlobalcodeException;
import labs24_connection_2.aj3.util.SqlBuilder;

public class ClientesDAOImpl implements IClientesDAO {

	SqlBuilder cn = new SqlBuilder();

	public void excluir(String cpf) throws GlobalcodeException {
		

		try {
			Statement stmt = SqlBuilder.cn.createStatement();
				
			ResultSet rs = stmt.executeQuery("SELECT count(*) FROM clientes WHERE cpf = " + cpf);
	
			if(rs != null) {
					
				stmt.executeUpdate("DELETE FROM clientes WHERE cpf = " + cpf);
				System.out.println("Cliente deletado!");
	
			} else {
				System.out.println("O Cliente com este ID não existe no banco de dados");
			}
		
		} catch (Exception e) {
			System.out.println("Não foi possível excluir o Cliente no banco de dados!");
		}	
	}

	public void salvar(Cliente cliente) throws GlobalcodeException{
		
		try {
			
			if(this.cn == null) {
				System.out.println("A conexão foi fechada!");
			} else {
				Statement stmt = SqlBuilder.cn.createStatement();
		
				stmt.executeUpdate("INSERT INTO clientes(nome,"
												+ "cpf,"
												+ "telefone)"
									+ "Values('" + cliente.getNome() + "','"
												+ cliente.getCpf() + "','"
												+ cliente.getTelefone() + "')");
		
				System.out.println("Cliente inserido!");
			}
		} catch (Exception ex) {
			System.out.println("Erro ao incluir cliente");
		}
	}		


	public List getAllClientes() {
		List<Cliente> clientes = new ArrayList();
		try {
			
			Statement stmt = SqlBuilder.cn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from clientes");
			
			while(rs.next()) {
				Cliente c = new Cliente(rs.getString(2), rs.getString(4), rs.getString(3), rs.getInt(1));
				clientes.add(c);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return clientes;
	}

	public Cliente getClienteByCPF(String cpf) throws GlobalcodeException{
		Cliente c = null;

		try {

			Statement stmt = SqlBuilder.cn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from clientes WHERE cpf = " + cpf);
			
			while(rs.next()) {
				c = new Cliente(rs.getString(2), rs.getString(4), rs.getString(3));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return c;
	}
}
