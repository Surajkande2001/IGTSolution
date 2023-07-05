package demo1;





import java.io.IOException;
import java.io.PrintWriter;

 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

public class Demo3 extends HttpServlet {

 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String fullname= fname+" "+lname;
       // System.out.println(name);
        PrintWriter out = response.getWriter();
        out.print("<h1>");
        out.print("My Full Name is :"+fullname);
        out.print("</h1>");
    }

 

}