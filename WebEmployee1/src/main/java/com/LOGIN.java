package com;

import java.io.IOException;
import java.io.PrintWriter;

 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

public class LOGIN extends HttpServlet {
    private static final long serialVersionUID = 1L;

 


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("uname");
        String pass = request.getParameter("upass");

        PrintWriter out = response.getWriter();
        if(name.equalsIgnoreCase("Rushikesh") && pass.equalsIgnoreCase("Rushikesh@123")) {
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.forward(request, response);
        }
        else {
            out.print("<p style='color: red'> Please Try once Again </p>");
            RequestDispatcher rd = request.getRequestDispatcher("login.html");
            rd.include(request, response);
        }
    }

 

 

}