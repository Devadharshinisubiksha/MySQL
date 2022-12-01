package mysqlproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createtable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","V@rshin1");
			Statement stmt=conn.createStatement();
			
			String sql="CREATE TABLE EMP" +
			"(eid INTEGER not null, " +
			"firstname VARCHAR(255)," +
			"lastname VARCHAR(255), " +
			"age INTEGER,"+
			"PRIMARY KEY(eid))";
			
			stmt.executeUpdate(sql);
			System.out.println("created table in given database...");
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
