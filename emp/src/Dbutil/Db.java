package Dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Db {
public static Connection getConnection() {
	Connection connection=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","root");
	}catch (Exception e) {
		e.printStackTrace();
	}
	return connection;
}
public static void close(Connection con,Statement stmt,ResultSet rs){
	try {
		if(rs != null)
			rs.close();
		if(stmt != null)
			stmt.close();
		if(con != null)
			con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}

}
}
