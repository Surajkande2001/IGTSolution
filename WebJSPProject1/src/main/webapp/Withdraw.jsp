<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Withdraw Amount</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<style>
		body {
			background-color: yellow;
			padding-top: 100px;
		}

		.container {
			text-align: center;
		}

		h1 {
			color: #333333;
		}

		.result {
			margin-top: 20px;
		}

		.result a {
			margin-top: 10px;
			display: inline-block;
		}
	</style>
</head>

<body>
	<div class="container">
		<h1>Withdraw Amount</h1>
		<%
		int id = Integer.parseInt(request.getParameter("id"));
		int amt = Integer.parseInt(request.getParameter("amt"));
		
		// PrintWriter out = response.getWriter();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1","root","@#Shubham1");
			
			PreparedStatement p = con.prepareStatement("update account set inb = inb-? where id = ?");
			
			p.setInt(1, amt);
			p.setInt(2, id);
			
			p.execute();
			p.close();
			
			out.print("<div class='result'>");
			out.print("<h3>Withdraw Amount: " + amt + "</h3>");
			out.print("<a href='Index.html' class='btn btn-primary'>Home page</a>");
			out.print("</div>");
			
		} catch(Exception e) {
			
			System.out.println(e);
		}
		%>
	</div>

	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
