package mysqlproject;
import java.sql.Connection;
import java.sql.DriverManager;

public class checkconnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn= DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","YES");
			System.out.println("database is connected !");
			
		}
catch (Exception e) {
	System.out.println("do not connect to db-error:"+e);
}
	}

}
