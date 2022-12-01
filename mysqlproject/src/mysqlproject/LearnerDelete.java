package mysqlproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LearnerDelete {

public static void main(String[] args) {

try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = null;
conn = DriverManager.getConnection("jdbc:mysql://localhost/jdbcop", "root", "V@rshin1");
Statement stmt = conn.createStatement();
String sql = "Delete from learner where lid=4";
stmt.executeUpdate(sql);
ResultSet rs = stmt.executeQuery("Select * from learner");
while (rs.next()) {
System.out.println("lID:" + rs.getInt("lid"));
System.out.println(",lName:" + rs.getString("lname"));
System.out.println(",lcity:" + rs.getString("lcity"));
System.out.println(",ldeg:" + rs.getString("ldeg"));
}

System.out.println("Records deleted successfully...");
rs.close();
} catch (Exception e) {
e.printStackTrace();
}

}

}
