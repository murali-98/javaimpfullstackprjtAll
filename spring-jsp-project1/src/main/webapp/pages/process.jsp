<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String EmployeeName=request.getParameter("EmployeeName");
String EmployeeId=request.getParameter("EmployeeId");
String OrganisationMail=request.getParameter("OrganisationMail");
String Technology=request.getParameter("Technology");
String Manager=request.getParameter("Manager");
try
{
         Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vijay", "root", "root");
           Statement st=conn.createStatement();
           int i=st.executeUpdate("insert into Employee(EmployeeName,EmployeeId,OrganisationMail,Technology,Manager)values('"+EmployeeName+"','"+EmployeeId+"','"+OrganisationMail+"','"+Technology+"','"+Manager+"')");
        out.println("Data is successfully inserted!");
        }
        catch(Exception e)
        {
        System.out.print(e);
        e.printStackTrace();
        }
 %>
 <a href="application">Applications</a>