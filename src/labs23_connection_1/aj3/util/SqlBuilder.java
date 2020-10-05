package labs23_connection_1.aj3.util;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlBuilder {

	/*
	 * Os valores das constantes abaixo devem estar de acordo com o banco de
	 * dados utilizado.
	 */
	private static final String DRIVER = "jdbc";
	private static final String DB = "mysql";
	private static final String HOST = "localhost";
	private static final String IP = "3306";
	private static final String DATABASE = "banco";
	private static final String TIMEZONE = "?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	Connection cn;
	public SqlBuilder() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			this.getConnection();
		} catch (ClassNotFoundException e) {
			System.out.println("Driver não encontrado!");
		} catch (SQLException e) {
			System.out.println("Algo deu errado na conexão com o banco de dados!");
		}
		
	}
	
	private void getConnection() throws SQLException {

		cn = DriverManager.getConnection(
						SqlBuilder.DRIVER + ":" +
						SqlBuilder.DB + "://" +
						SqlBuilder.HOST + ":" +
						SqlBuilder.IP + "/" +
						SqlBuilder.DATABASE + 
						SqlBuilder.TIMEZONE,
						SqlBuilder.USER,
						SqlBuilder.PASSWORD);
		
	}

	public void closeAll() {
		try {
			if(this.cn != null) {
				this.cn.close();
			}
			
		} catch (Exception e) {
			System.out.println("---> Nao foi possivel fechar a conexao com o banco");
			System.out.println("---> Detalhamento do erro: ");
			e.printStackTrace();
		}
	}
	
	public void testConnection() {
		try {
			if(!this.cn.isClosed()) {
				System.out.println("A conexão está aberta!");
			} else {
				System.out.println("A conexão está fechada!");
			}
		} catch (SQLException e) {
			System.out.println("Erro ao testar conexão");
		}
	}
}
