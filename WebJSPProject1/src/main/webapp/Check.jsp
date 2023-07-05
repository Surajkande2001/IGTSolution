<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Account Information</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<style>
		body {
			background-image: url("igt.jpg");
			background-repeat: no-repeat;
			background-size: cover;
			color: red;
		}

		.container {
			margin-top: 50px;
		}

		h4 {
			margin-bottom: 20px;
		}

		.table {
			color: red;
		}

		.table th {
			color: red;
		}
	</style>
</head>
<body>
	<div class="container">
		<%
			try {
				ServletContext context = getServletContext();
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1","root","@#Shubham1");

				Statement s = con.createStatement();
				ResultSet r = s.executeQuery("select * from account");

				out.print("<h4>Account Information</h4>");
				out.print("<table class='table'>");
				out.print("<thead class='thead-dark'>");
				out.print("<tr>");
				out.print("<th scope='col'>id</th>");
				out.print("<th scope='col'>name</th>");
				out.print("<th scope='col'>account number</th>");
				out.print("<th scope='col'>ifsc code</th>");
				out.print("<th scope='col'>pan card</th>");
				out.print("<th scope='col'>phone number</th>");
				out.print("<th scope='col'>address</th>");
				out.print("<th scope='col'>balance</th>");
				out.print("</tr>");
				out.print("</thead>");
				out.print("<tbody>");

				while(r.next()) {
					out.print("<tr>");
					out.print("<td>" + r.getInt(1) + "</td>");
					out.print("<td>" + r.getString(2) + "</td>");
					out.print("<td>" + r.getString(3) + "</td>");
					out.print("<td>" + r.getString(4) + "</td>");
					out.print("<td>" + r.getString(5) + "</td>");
					out.print("<td>" + r.getString(6) + "</td>");
					out.print("<td>" + r.getString(7) + "</td>");
					out.print("<td>" + r.getInt(8) + "</td>");
					out.print("</tr>");
				}

				out.print("</tbody>");
				out.print("</table>");

				out.print("<a href='Index.html'>Home page</a>");
			} catch(Exception e) {
				System.out.println(e);
			}
		%>
	</div>

	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
