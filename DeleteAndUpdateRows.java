
/*
Question:
Write a program to update and delete contents in a table in MySql database.
*/


import java.sql.*;

public class DeleteRows {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=Vimal@9440942366");
			Statement stmt = con.createStatement();
			// update a value
			stmt.executeUpdate("update class1 set major = 'DS' where id = 1");
			ResultSet res = stmt.executeQuery("select * from class1");
			System.out.println("After updating, the contents are : ");
			while(res.next()){
				System.out.println(res.getInt(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
				System.out.println("====================================");
			}
			
			// delete a row
			stmt.executeUpdate("delete from class1 where id = 1");
			System .out.println("After deleting the contents are : ");
			res = stmt.executeQuery("select * from class1");
			while(res.next()){
				System.out.println(res.getInt(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
				System.out.println("====================================");
			}
			con.close();
			}
			catch(Exception e) {}
	}

}
