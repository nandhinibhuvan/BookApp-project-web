
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Order</title>
</head>
<h3>list books</h3>
<table border="1">
	<tbody>
		<%
			orderDAO orderDAO = new orderDAO();
			List<Order> orderList = orderDAO.listorder();
		%><table border="1">
			<thead>
				<tr>
					<th>id</th>
					<th>user_id</th>
					<th>book_id</th>
					<th>quantity</th>
					<th>satus</th>
					<th>Ordered_date</th>


				</tr>
			</thead>
			<tbody>
				<%<%@page import="java.util.List"%>
<%@page import="model.Order"%>
<%@page import="dao.OrderDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Order</title>
</head>
<body>
<h3>list books</h3>
<table border="1">
	<tbody>
		<%
			OrderDAO orderDAO = new OrderDAO();
			List<Order> orderList = orderDAO.listorder();
		%><table border="1">
			<thead>
				<tr>
					<th>id</th>
					<th>user_id</th>
					<th>book_id</th>
					<th>quantity</th>
					<th>status</th>
					<th>Ordered_date</th>


				</tr>
			</thead>
			<tbody>
				<%
					for (Order b : orderList) {
						out.println("<tr>");
						out.println("<td>" + b.getId() + "</td>");
						out.println("<td>" + b.getUserid() + "</td>");
						out.println("<td>" + b.getBookid() + "</td>");
						out.println("<td>" + b.getQuantity() + "</td>");
						out.println("<td>" + b.getStatus() + "</td>");
						out.println("<td>" + b.getOrderDate() + "</td>");
						out.println("</tr>");
					}
				
				%>
			</tbody>
		</table>


	</tbody>


</body>
</html>for (Order b : orderList) {
						out.println("<tr>");
						out.println("<td>" + b.getId() + "</td>");
						out.println("<td>" + b.getUser_id() + "</td>");
						out.println("<td>" + b.getBook_id() + "</td>");
						out.println("<td>" + b.getQuantity() + "</td>");
						out.println("<td>" + b.getSatus() + "</td>");
						out.println("<td>" + b.getOrdered_date() + "</td>");
						out.println("</tr>");
					}
				
				%>
			</tbody>
		</table>


	</tbody>
	<body>
	</body>
	</html>