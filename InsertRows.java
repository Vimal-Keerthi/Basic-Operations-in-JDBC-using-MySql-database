
/*
Question : 
Write a program to insert rows into a table in MySql database
*/


import java.sql.*;

public class InsertRows {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=Vimal@9440942366");
			Statement stmt = con.createStatement();
			int rno =  stmt.executeUpdate("insert into class1 values(1, 'CHAITANYA', 'C++')");
			System.out.println("No of rows affected : "+ rno);
			System.out.println("====================================");
			System.out.println("The contents are : ");
			ResultSet res = stmt.executeQuery("select * from class1");
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
