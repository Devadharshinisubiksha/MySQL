package mysqlproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class LearnerSelect {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=null;
		c=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","V@rshin1");
 Statement stmt = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

		   ResultSet rs=null;
		   rs=stmt.executeQuery("select * from LEARNER");
		   
		   System.out.println("No of records:");
		   while(rs.next()) {
		    System.out.println("LID:" + rs.getInt("Lid"));
		    System.out.println(",lname:" +rs.getString("lname"));
		    System.out.println(",lcity:" + rs.getString("lcity"));
		   }
		   rs.last();
		   System.out.println("Table contains" + rs.getRow()+"rows");
		}catch(Exception e) {
		e.printStackTrace();
		}
		}
		}
	