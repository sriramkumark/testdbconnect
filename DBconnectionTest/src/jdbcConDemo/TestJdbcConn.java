package jdbcConDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbcConn {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";

	Connection con=	DriverManager.getConnection("jdbc:mysql://" + host + ":" +3306+ "/qadbtest" ,"root","root123");
	Statement stmt = con.createStatement();
	ResultSet rs= stmt.executeQuery("select * from test");
	while(rs.next())
	{
		System.out.println(rs.getInt("sno"));
		System.out.println(rs.getString("sname"));
		System.out.println(rs.getString("dept"));
	}
		
		
	}

}
