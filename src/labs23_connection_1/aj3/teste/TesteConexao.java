/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package labs23_connection_1.aj3.teste;

import java.sql.Connection;

import labs23_connection_1.aj3.exception.GlobalcodeException;
import labs23_connection_1.aj3.util.SqlBuilder;

public class TesteConexao {

	public static void main(String[] args) {
		SqlBuilder cn = null;
		try {
			cn = new SqlBuilder();
			
			cn.testConnection();
			cn.closeAll();
			cn.testConnection();
			
		} catch (Exception e) {
			System.out.println("---> " + e.getMessage());
			System.out.println("---> Detalhamento do erro: ");
			e.printStackTrace();
		} finally {
			cn.closeAll();
		}
	}

}
