<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<% 
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "vijay";
String userid = "root";
String password = "root";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<head>
<style>

h1 {margin:32%;
  font-size: 50px;
}

h2{padding:1%}
h1,h2{
display:inline;}
</style>

<link rel="stylesheet" href="pages/style1.css"> 

<meta charset="UTF-8">
<title>Dashboard</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from User";
resultSet= statement.executeQuery(sql);
while(resultSet.next()){
%>

<h1 align="center" >Welcome <%=resultSet.getString("username") %></h1>
<a href="login" ><h2 align="right"><i class="fa fa-sign-out"></i></h2></a>
<br>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
<br><br><br><br><br>
<a href="application" ><h2>View Employee Details</h2></a>
</body>
</html>