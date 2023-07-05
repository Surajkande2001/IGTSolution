package demo3;

import java.io.IOException;
import java.io.PrintWriter;

 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

 

public class Update extends HttpServlet {
    private static final long serialVersionUID = 1L;


 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("uid"));
        int salary = Integer.parseInt(request.getParameter("salary"));
        PrintWriter out = response.getWriter();

 


        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1","root","@#Shubham1");
            PreparedStatement pstmt = con.prepareStatement("update emp set salary=? where id = ?");

            pstmt.setInt(1, salary);
            pstmt.setInt(2, id);

            pstmt.execute();
//            pstmt.close();
            out.print("<h1>");
            out.print("Id:" + id + "<br>");
            out.print("Salary" + salary + "<br>");
            out.print("</h1>");
            out.print("updated");


        } catch(Exception e) {
            System.out.println(e);
        }
    }

 


}