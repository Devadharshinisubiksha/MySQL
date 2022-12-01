package mysqlproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class learnertable {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","V@rshin1");
			Statement stmt=conn.createStatement();

			String sql="CREATE TABLE LEARNER" +
			"(lid INTEGER not null, " +
			"lname VARCHAR(255),"  +
			"lcity varchar(255),"+
			"ldeg varchar(200),"+
			"PRIMARY KEY(lid))";

			stmt.executeUpdate(sql);
			System.out.println("created table in given database...");
			conn.close();
			}
			catch(Exception e) {
			e.printStackTrace();
			}

	}

}
