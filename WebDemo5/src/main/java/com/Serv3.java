package com;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

 

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 


public class Serv3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 

    	try {

//          ServletConfig config = getServletConfig();
//          
//          String driver = config.getInitParameter("driver");
//          String url = config.getInitParameter("url");
//          String username = config.getInitParameter("username");
//          String password = config.getInitParameter("password");



          ServletContext context = getServletContext();

          String driver = context.getInitParameter("driver");
          String url = context.getInitParameter("url");
          String username = context.getInitParameter("username");
          String password = context.getInitParameter("password");


          Class.forName(driver);
          Connection con = DriverManager.getConnection(url, username, password);

          Statement s = con.createStatement();

          s.execute("insert into employee values(200, 'bharat', 35, 60000, 'trainee')");
          s.close();

          PrintWriter out = response.getWriter();

          out.print("inserted");

      } catch (Exception e) {

          System.out.println(e);}
      }
 

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

 

}