package mysqlproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class insertclass {

	public static void main(String[] args) {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn=null;
	conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","V@rshin1");
				Statement stmt=conn.createStatement();
				System.out.println("Inserting records into the table.....");
				String sql="INSERT INTO EMP VALUES (1,'shri','varshini',23)";
				stmt.executeUpdate(sql);
				sql="INSERT INTO EMP VALUES (2,'Sathya','Narayan',17)";
				stmt.executeUpdate(sql);
				sql="INSERT INTO EMP VALUES (3,'Bharathi','Bharat',38)";
				stmt.executeUpdate(sql);
				sql="INSERT INTO EMP VALUES (4,'Vijaya','Lakshmi',36)";
				stmt.executeUpdate(sql);
				}
				catch(Exception e)
				{
				e.printStackTrace();
				}
		}
}
		

	


