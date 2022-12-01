package mysqlproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LearnInsert {

public static void main(String[] args) {
// TODO Auto-generated method stub
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn=null;
conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","V@rshin1");
Statement stmt=conn.createStatement();
System.out.println("Inserting records into the table.....");
String sql="INSERT INTO LEARNER VALUES (1,'shrivarshini','chennai','B.Tech')";
stmt.executeUpdate(sql);
sql="INSERT INTO LEARNER VALUES (2,'Seshu','tvmalai','BBA')";
stmt.executeUpdate(sql);
sql="INSERT INTO LEARNER VALUES (3,'Bharathi','pondicherry','M.A')";
stmt.executeUpdate(sql);
sql="INSERT INTO LEARNER VALUES (4,'Viji','trichy','M.COM')";
stmt.executeUpdate(sql);
}
catch(Exception e)
{
e.printStackTrace();
}

}

}

