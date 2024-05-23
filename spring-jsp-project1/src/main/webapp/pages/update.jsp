<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("id");
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
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from Employee where id="+id;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<!DOCTYPE html>
<html>
<body>

<form method="post" action="update-process">
<input type="hidden" name="id" value="<%=resultSet.getString("id") %>">
<input type="text" name="id" value="<%=resultSet.getString("id") %>">
<br>
Employee Name:<br>
<input type="text" name="first_name" value="<%=resultSet.getString("EmployeeName") %>">
<br>
Employee Id:<br>
<input type="text" name="last_name" value="<%=resultSet.getString("EmployeeId") %>">
<br>
Organization Mail<br>
<input type="text" name="city_name" value="<%=resultSet.getString("OrganisationMail") %>">
<br>
Technology<br>
<input type="text" name="email" value="<%=resultSet.getString("Technology") %>">
<br>
Manager<br>
<input type="text" name="email" value="<%=resultSet.getString("Manager") %>">
<br><br>
<input type="submit" value="submit">
</form>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>
