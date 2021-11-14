import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexaoserie {
	public Connection getConexao() throws SQLException
	{
		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/series","root","jeanjean");
	}

}
