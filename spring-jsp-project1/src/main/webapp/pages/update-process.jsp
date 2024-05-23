<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/vijay";%>
<%!String user = "root";%>
<%!String psw = "root";%>
<%
String id = request.getParameter("id");
String EmployeeName=request.getParameter("EmployeeName");
String EmployeeId=request.getParameter("EmployeeId");
String OrganisationMail=request.getParameter("OrganisationMail");
String Technology=request.getParameter("Technology");
String Manager=request.getParameter("Manager");
if(id != null)
{
Connection con = null;
PreparedStatement ps = null;
int personID = Integer.parseInt(id);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="Update Employee set id=?,EmployeeName=?,EmployeeId=?,OrganisationMail=?,Technology=?,Manager=?, WHERE id="+id;
ps = con.prepareStatement(sql);
ps.setString(1,id);
ps.setString(2,EmployeeName);
ps.setString(3,EmployeeId);
ps.setString(4,OrganisationMail);
ps.setString(5,Technology);
ps.setString(6,Manager);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
}
else
{
out.print("There is a problem in updating Record.");
} 
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>