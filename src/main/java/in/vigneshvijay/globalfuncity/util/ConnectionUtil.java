package in.vigneshvijay.globalfuncity.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() {
		Connection connection = null;
		String url = null;
		String userName = null;
		String password = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection = DriverManager.getConnection(
			  "jdbc:mysql://aws.connect.psdb.cloud/globalfuncity?sslMode=VERIFY_IDENTITY",
			  "93tlx50rzrmam3zke7yi",
			  "pscale_pw_CLayrOsIDGTFEIcrWoDd0NJm2qFc568H1PnEp3dBYEg");

		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return connection;
	}
	
	public static void close(Connection connection, PreparedStatement ps) {
		try {
			if(ps != null) {
				ps.close();
			}
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection connection, PreparedStatement ps, ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
			if(ps != null) {
				ps.close();
			}
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
