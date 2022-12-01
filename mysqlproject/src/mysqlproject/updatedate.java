package mysqlproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class updatedate {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = null;
			c = DriverManager.getConnection("jdbc:mysql://localhost/jdbcop", "root", "V@rshin1");
			Statement stmt = c.createStatement();
			String sql = "Update emp set age=32 where eid in(1,2)";
			stmt.executeUpdate(sql);
			ResultSet rs = stmt.executeQuery("Select * from emp");
			while (rs.next()) {
			System.out.println("EID:" + rs.getInt("eid"));
			System.out.println(", Age:" + rs.getInt("Age"));
			System.out.println(", First Name:" + rs.getString("firstname"));
			System.out.println(", Last Name:" + rs.getString("lastname"));
			}
			System.out.println("Records updated successfully...");
			rs.close();
			} catch (Exception e) {
			e.printStackTrace();
			}

	}

}
