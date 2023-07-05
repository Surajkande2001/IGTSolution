package com;







import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

 

public class UpdateRecord {
    public static void main(String[] args) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1","root","@#Shubham1");
//        Statement stmt=con.createStatement();
//        stmt.execute("insert into employee values(789,'Akash',22,45000,'')");

        PreparedStatement pstmt = con.prepareStatement("update employee set Salary= ? where id= ? ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID :");
        int id = sc.nextInt();

        System.out.println("Enter Salary");
        int salary = sc.nextInt();

        pstmt.setInt(1, salary);
        pstmt.setInt(2, id);
        pstmt.execute();
        pstmt.close();
        System.out.println("data Updated Sucessfully...!");
    } catch (Exception e) {
        System.out.println(e);
    }

 

}

 

}



