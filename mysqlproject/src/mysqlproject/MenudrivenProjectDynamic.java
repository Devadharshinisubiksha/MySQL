package mysqlproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class MenudrivenProjectDynamic {

	public static void main(String[] args) {
		Scanner Sc=new Scanner (System.in);
		int eid,age,ch,k;
		String firstnamr,lastname;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = null;
			c = DriverManager.getConnection("jdbc:mysql://localhost/jdbcop", "root", "V@rshin1");
			Statement stmt = c.createStatement();
			do {
	System.out.println("1.Insert \n2.Update \n3.Delete \n4.Search \n5.Display \n6.Count Employee\n7.Minimum age \n8.Maximum Age \n9.Average age \n10.Exit");
System.out.println("\n select your option");
		ch=Integer.parseInt(Sc.nextLine());
		switch(ch) {
		case 1:
			System.out.println("How many records you want to insert:");
			Integer n = Integer.parseInt(Sc.nextLine());
			for (int i = 0; i < n; i++) {
			System.out.println("\n Enter the Lid:");
			lid = Integer.parseInt(Sc.nextLine());
			System.out.println("\n Enter the Lname:");
			lname = (Sc.nextLine());
			System.out.println("\n Enter the Lcity:");
			lcity = (Sc.nextLine());
			System.out.println("\n Enter the Ldeg:");
			ldeg = (Sc.nextLine());

	k = stmt.executeUpdate("Insert into learner value(" + lid + ",'" + lname + "', '" + lcity
			+ "', '" + ldeg + "')");
break;
			}
		case 2:
			System.out.println("\n Enter the Lid:");
			lid = Integer.parseInt(Sc.nextLine());
			System.out.println("\n Enter the Lcity:");
			lcity = (Sc.nextLine());

			k = stmt.executeUpdate("Update learner set lcity='" + lcity + "' where lid=" + lid + "");

			System.out.println("------------------");
			break;
		case 3:
			System.out.println("\n Enter The Lid : ");
			lid = Integer.parseInt(Sc.nextLine());

			k =stmt.executeUpdate( "DELETE from Learner WHERE lid = "+lid+"");

			System.out.println("Record is deleted");

			System.out.println("------------------------");
			break;
		case 4:
			System.out.println("\n Enter the Lid to Search Data:");
			lid = Integer.parseInt(Sc.nextLine());
			ResultSet rs = stmt.executeQuery("Select * from learner where lid=" + lid);
			while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			}
			System.out.println("-----------");
			break;
		case 5:
			ResultSet rs1 = stmt.executeQuery("Select * from learner");
			while (rs1.next()) {
			System.out.println("lid:" + rs1.getInt(1));
			System.out.println("lname:" + rs1.getString(2));
			System.out.println("lcity:" + rs1.getString(3));
			System.out.println("ldeg:" + rs1.getString(4));
			}
			System.out.println("-----------");
			break;
		case 6:
			String q = "Select count(*) from learner";
			ResultSet rs2 = stmt.executeQuery(q);
			rs2.next();
			int count = rs2.getInt(1);
			System.out.println("Number of learners:" + count);
			System.out.println("-----------");
			break;
		case 7:
			ResultSet rs3 = stmt.executeQuery("select * from Learner " + "ORDER BY Lid ASC");
			while (rs3.next()) {
			System.out.println("lid :" + rs3.getInt(1));
			}

			System.out.println("Lid in Ascending Order: ");

			System.out.println("------------------------");
			break;
		case 8:
			ResultSet rs4 = stmt.executeQuery("select * from Learner " + "ORDER BY Lid DESC");
			while (rs4.next()) {
			System.out.println("lid :" + rs4.getInt(1));
			}

			System.out.println("Lid in Descending Order: ");

			System.out.println("------------------------");
			break;
		case 9:
			System.out.println("Exit operations");
			System.exit(0);
			default:
			System.out.println("\n Invalid option, enter valid option \n");

			break;

			}
			} while (true);

			} catch (Exception e) {
			e.printStackTrace();
			}

			}

			}




		
