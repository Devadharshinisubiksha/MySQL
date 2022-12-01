package mysqlproject;
import java.sql.Connection;
import java.sql.DriverManager;

public class preparedstatementinsert {

	public static void main(String[] args) {
		try
		{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","V@rshin1");
		String str = "INSERT INTO EMP(eid,age,firstname,lastname)values(?,?,?,?)";
		java.sql.PreparedStatement ps = conn.prepareStatement(str);
		ps.setInt(1, 92);
		ps.setInt(2, 16);
		ps.setString(3, "bharati");
		ps.setString(4, "K");
		ps.execute();
		System.out.println("Record is inserted successfully");
		conn.close();
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
	}

}

