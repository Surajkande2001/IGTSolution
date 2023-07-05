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

 

@WebServlet("/DeleteRecord")
public class Delete extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        int id = Integer.parseInt(request.getParameter("uid"));

        PrintWriter out = response.getWriter();

        try {

 

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");

            PreparedStatement p = con.prepareStatement("delete from employee where id = ?");

            p.setInt(1, id);

            p.execute();
            p.close();

            out.print("<h1>");
            out.print("Id:" + id + "<br>");
            out.print("</h1>");
            out.print("Deleted");
        } catch(Exception e) {

            System.out.println(e);
        }    

    }

}
