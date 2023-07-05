<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<style>
		body {
			background-color: #f2f2f2;
			font-family: Arial, sans-serif;
			margin: 0;
			padding: 20px;
		}

		h1 {
			text-align: center;
			color: #333333;
		}

		a {
			display: inline-block;
			margin-top: 10px;
			text-decoration: none;
			padding: 8px 16px;
			border-radius: 5px;
			background-color: #007bff;
			color: #fff;
		}
	</style>
</head>

<body>
	<%
	int id = Integer.parseInt(request.getParameter("id"));
	int amt = Integer.parseInt(request.getParameter("amt"));
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1", "root", "@#Shubham1");
		
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
