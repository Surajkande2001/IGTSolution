<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*" %>


<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

    
    int salary = Integer.parseInt(request.getParameter("usalary"));
    
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
            out.print("salary" + salary + "<br>");
            out.print("</h1>");
            out.print("updated");


        } catch(Exception e) {
            System.out.println(e);
        }
%>
</body>
</html>