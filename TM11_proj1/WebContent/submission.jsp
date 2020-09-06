<%@page import="com.wipro.bean.AuctionData"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body bgcolor="yellow">
<h1 style="margin-left: 40%">Bid Submitted</h1>

<p style="margin-left: 20%;font-size: 20px;"><b>Your bid is now active.If your bid is successful, you will be notified within 24 hours of the close of bidding. </b></p>
<% AuctionData obj=(AuctionData)request.getAttribute("data");%>
<table  border ="1" style="width:350; margin-left:40%">
	<tr style="background-color:black; color: white "><td><%=obj.getItemname()%></td></tr>
	<tr><td><%=obj.getItemid() %></td></tr>
	<tr><td><%=obj.getUname() %></td></tr>
	<tr><td><%=obj.getEmail() %></td></tr>
	<tr><td><%=obj.getAmount() %></td></tr>
	<tr><td><%=obj.isAutoincreement() %></td></tr>
</table>

</body>
</html>