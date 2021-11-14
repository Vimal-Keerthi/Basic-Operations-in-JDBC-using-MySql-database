
/*
Question:
Write a program to retrieve contents of a table 
in MySql database.
*/


import java.sql.*;

class RetrieveData{
	public static void main(String[] args){
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=Vimal@9440942366");
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery("select * from class1");
		
		while(res.next()){
			System.out.println(res.getInt(1));
			System.out.println(res.getString(2));
			System.out.println(res.getString(3));
			System.out.println("====================================");
		}
		con.close();
	}
}