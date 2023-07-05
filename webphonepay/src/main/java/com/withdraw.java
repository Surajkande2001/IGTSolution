package com;

 

import java.io.IOException;
import java.io.PrintWriter;

 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

 

public class withdraw extends HttpServlet {
    private static final long serialVersionUID = 1L;


 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int accno = Integer.parseInt(request.getParameter("accno"));
        int bal = Integer.parseInt(request.getParameter("bal"));
        PrintWriter out = response.getWriter();

 


        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1","root","@#Shubham1");
            PreparedStatement pstmt = con.prepareStatement("update upi set bal = ? where id = ?");

            pstmt.setInt(1, bal);
            pstmt.setInt(2, accno);

            pstmt.execute();
//            pstmt.close();
            out.print("<h1>");
            out.print("ACCOUNT NO:" + accno + "<br>");
            out.print("AVAILABLE BALANCE" + bal + "<br>");
            out.print("</h1>");
            out.print("updated");
            out.print("<a href='index.html' >Home</a>");


        } catch(Exception e) {
            System.out.println(e);
        }
    }

 


}