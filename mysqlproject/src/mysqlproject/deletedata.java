package mysqlproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class deletedata {
public static void main(String[] args) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c = null;
c = DriverManager.getConnection("jdbc:mysql://localhost/jdbcop", "root", "V@rshin1");
Statement stmt = c.createStatement();
String sql = "Delete from emp where eid=4";
stmt.executeUpdate(sql);
ResultSet rs = stmt.executeQuery("Select * from emp");
while (rs.next()) {
System.out.println("EID:" + rs.getInt("eid"));
System.out.println(", Age:" + rs.getInt("Age"));
System.out.println(", First Name:" + rs.getString("firstname"));
System.out.println(", Last Name:" + rs.getString("lastname"));
}

System.out.println("Records deleted successfully...");
rs.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}