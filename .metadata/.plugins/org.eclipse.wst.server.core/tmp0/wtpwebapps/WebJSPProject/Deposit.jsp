<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

           <% 
int id = Integer.parseInt(request.getParameter("id"));
		int amt = Integer.parseInt(request.getParameter("amt"));
		
		//PrintWriter out = response.getWriter();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1","root","@#Shubham1");
			
			PreparedStatement p = con.prepareStatement("update account set inb = inb+? where id = ?");
			
			p.setInt(1, amt);
			p.setInt(2, id);
			
			p.execute();
			p.close();
			
			out.print("<h1>");
			out.print("Deposited Amount: " + amt + "<br>");

			out.print("<a href='Index.html'>Home page</a>");
			
		} catch(Exception e) {
			
			System.out.println(e);
		}
		
	
	
	%>
</body>
</html>