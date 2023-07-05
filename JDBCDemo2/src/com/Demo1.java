package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo1 {
	
public static void main(String[] args) {
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1","root","@#Shubham1");
			
			Statement stmt = con.createStatement();
			stmt.execute("insert into employee values(200,'bharath',35,60000,'Developer')");
			
			
			stmt.close();
			
			System.out.println("data inserted succesfully....!");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}



