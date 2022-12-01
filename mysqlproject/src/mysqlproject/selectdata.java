package mysqlproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class selectdata {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=null;
			c=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","V@rshin1");
			   Statement stmt = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			   ResultSet rs=null;
			   rs=stmt.executeQuery("select * from emp");
			   
			   System.out.println("No of records:");
			   while(rs.next()) {
			    System.out.println("EID:" + rs.getInt("eid"));
			    System.out.println(", Age:" + rs.getInt("Age"));
			    System.out.println(", First Name:" +rs.getString("firstname"));
			    System.out.println(", Last Name:" + rs.getString("lastname"));
			   }
			   rs.last();
			   System.out.println("Table contains" + rs.getRow()+"rows");
			}catch(Exception e) {
			e.printStackTrace();
			}

	}

}
