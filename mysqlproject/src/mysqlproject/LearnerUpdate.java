package mysqlproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LearnerUpdate {

public static void main(String[] args) {
// TODO Auto-generated method stub
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c = null;
c = DriverManager.getConnection("jdbc:mysql://localhost/jdbcop", "root", "V@rshin1");
Statement stmt = c.createStatement();
String sql = "Update learner set ldeg='B.COM' where lid in(1,2)";
stmt.executeUpdate(sql);
ResultSet rs = stmt.executeQuery("Select * from learner");
while (rs.next()) {
System.out.println("LID:" + rs.getInt("Lid"));
System.out.println(",lName:" + rs.getString("lname"));
System.out.println(",lcity:" + rs.getString("lcity"));
System.out.println("ldeg:" + rs.getString("ldeg"));
}
System.out.println("Records updated successfully...");
rs.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}
