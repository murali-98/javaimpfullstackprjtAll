<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration form</title>
</head>
<body>
	<h1>User Register Form</h1>
	<form:form id="regForm" modelattribute="user"
		action="./registerProcess" method="post">
		<table align="center" style="with: 20%">
			<tr>
				<td><form:label path="username">Username</form:label</td>
				<td><form:input path="username" name="username" id="username" />
				</td>
			</tr>
			<tr>
				<td><form:label path="password">password</form:label</td>
				<td><form:input path="password" name="password " id="password" />
				</td>
			</tr>
			<tr>
				<td><form:label path="firstname">FirstName</form:label></td>
				<td><form:input path="firstname" name="firstname"
						id="firstname" /></td>
			</tr>
			<tr>
				<td><form:label path="lastname">LastName</form:label</td>
				<td><form:input path="lastname" name="lastname" id="lastname" />
				</td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label</td>
				<td><form:input path="email" name="email" id="email" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address</form:label</td>
				<td><form:input path="address" name="address" id="address" />
				</td>
			</tr>
			<tr>
				<td></td>
				<td><form:button name="register" id="register">Register</form:button>
				</td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="home.jsp">Home</a></td>
			</tr>
</table>
</form:form>
		
</body>
</html>