package com;

 

import java.sql.*;
import java.util.*;

 

public class DeleteRecord {

    public static void main(String[] args) {

        try {

 

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1","root","@#Shubham1");

            PreparedStatement p = con.prepareStatement("delete from employee where id = ?");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter id: ");
            int id = sc.nextInt();

            p.setInt(1, id);

            p.execute();
            p.close();

            System.out.println("Deleted");

        } 
        catch(Exception e) {

            System.out.println(e);
        }

    }

 

}