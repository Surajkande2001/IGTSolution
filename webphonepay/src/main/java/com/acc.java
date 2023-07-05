package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class acc extends HttpServlet {
    private static final long serialVersionUID = 1L;

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int accno = Integer.parseInt(request.getParameter("accno"));
        String ifsc = request.getParameter("ifsc");
        String pan = request.getParameter("pan");
        int phone = Integer.parseInt(request.getParameter("phone"));
        int adhar = Integer.parseInt(request.getParameter("adhar"));
        int bal = Integer.parseInt(request.getParameter("bal"));

 


        PrintWriter out = response.getWriter();

 

        try {

 

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1","root","@#Shubham1");

 

            PreparedStatement p = con.prepareStatement("insert into upi values(?, ?, ?, ?, ?, ?, ?, ?)");

 

            p.setInt(1, id);
            p.setString(2, name);
            p.setInt(3, accno);
            p.setString(4, ifsc);
            p.setString(5, pan);
            p.setInt(6, phone);
            p.setInt(7, adhar);
            p.setInt(8, bal);

 

            p.execute();
//            p.close();

 

            out.print("<h1>");
            out.print("ID:" + id + "<br>");
            out.print("NAME: " + name + "<br>");
            out.print("ACCOUNT NO: " + accno + "<br>");
            out.print("IFSC CODE: " + ifsc + "<br>");
            out.print("PAN: " + pan + "<br>");
            out.print("PHONE: " + phone + "<br>");
            out.print("AADHAAR: " + adhar + "<br>");
            out.print("BALANCE: " + bal + "<br>");
            out.print("</h1>");
            out.print("ACCOUNT CREATED<br>");
            out.print("<a href='index.html' >Home</a>");
        } catch(Exception e) {

 

            System.out.println(e);
        }    

 

    }

 

}