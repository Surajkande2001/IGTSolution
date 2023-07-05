<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			text-align: center;
			background-color: #f1f1f1;
			margin: 0;
			padding: 20px;
		}

		h1 {
			color: #333333;
		}

		a {
			color: #007bff;
			text-decoration: none;
		}

		table {
			border-collapse: collapse;
			margin: 20px auto;
		}

		td {
			padding: 10px;
		}
	</style>
</head>

<body>
	<%
	int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	String acc = request.getParameter("acc");
	String ifsc = request.getParameter("ifsc");
	String pan = request.getParameter("pan");
	String phn = request.getParameter("phn");
	String adr = request.getParameter("adr");
	int inb = Integer.parseInt(request.getParameter("inb"));

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1", "root", "@#Shubham1");

		PreparedStatement p = con.prepareStatement("insert into account values(?, ?, ?, ?, ?, ?, ?, ?)");

		p.setInt(1, id);
		p.setString(2, name);
		p.setString(3, acc);
		p.setString(4, ifsc);
		p.setString(5, pan);
		p.setString(6, phn);
		p.setString(7, adr);
		p.setInt(8, inb);

		p.execute();
		p.close();

		out.print("<h1>Account Created Successfully!</h1>");
		out.print("<table>");
		out.print("<tr><td>Id:</td><td>" + id + "</td></tr>");
		out.print("<tr><td>Name:</td><td>" + name + "</td></tr>");
		out.print("<tr><td>Account No:</td><td>" + acc + "</td></tr>");
		out.print("<tr><td>IFSC:</td><td>" + ifsc + "</td></tr>");
		out.print("<tr><td>PAN:</td><td>" + pan + "</td></tr>");
		out.print("<tr><td>Phone No:</td><td>" + phn + "</td></tr>");
		out.print("<tr><td>Aadhar:</td><td>" + adr + "</td></tr>");
		out.print("<tr><td>Initial Balance:</td><td>" + inb + "</td></tr>");
		out.print("</table>");

		out.print("<a href='Index.html'>Home page</a>");

	} catch (Exception e) {
		System.out.println(e);
	}
	%>
</body>

</html>
