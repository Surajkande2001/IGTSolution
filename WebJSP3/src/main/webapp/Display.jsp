<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1","root","@#Shubham1");

 

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from employee");

 

        while(rs.next()) {
            System.out.println(rs.getInt(1)+": "+rs.getString(2)+": "+rs.getInt(3)+": "+rs.getInt(4)+": "+rs.getString(5));
        }
         out.print("<h4>");
        out.print("<a href ='Entry.html'> HOME PAGE</a>");
        out.print("</h4>");
    } catch (Exception e) {
        System.out.println(e);
    }


</body>
</html>