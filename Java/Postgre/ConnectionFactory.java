package dao.postgre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection con = null;
	private static final String banco = "teste";
	private static final String user = "postgres";
	private static final String password = "neto";

	public static Connection getConnection() {
		if (con == null) {
			try {
				Class.forName("org.postgresql.Driver");
				con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + banco, user, password);

			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
	}
}
