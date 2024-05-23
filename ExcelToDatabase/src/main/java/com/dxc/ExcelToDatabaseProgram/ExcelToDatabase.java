package com.dxc.ExcelToDatabaseProgram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import  static java.lang.Integer.parseInt;

public class ExcelToDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl="jdbc:mysql://localhost:3306/excel_emp_data?useSSL=false";
		String username="root";
		String password="abcd";
		String filePath="C:\\Users\\mbr6\\Desktop\\EmployeeData2.csv";
		int batchSize=20;
		Connection connection=null;
		try 
		{
			connection=DriverManager.getConnection(jdbcUrl,username,password);
			connection.setAutoCommit(false);
			
			String sql="insert into employee(id,name,salary,address) values(?,?,?,?)";
			
			PreparedStatement statement=connection.prepareStatement(sql);
			
			BufferedReader lineReader=new BufferedReader(new FileReader(filePath));
			
			String lineText=null;
			int count=0;
			
			lineReader.readLine();
			while((lineText=lineReader.readLine())!= null){
				String[] data=lineText.split(",");
				
				String id=data[0];
				String name=data[1];
				String salary=data[2];
				String address=data[3];
				
				statement.setInt(1,parseInt(id));
				statement.setString(2, name);
				statement.setInt(3, parseInt(salary));
				statement.setString(4, address);
				
				statement.addBatch();
				
				if(count%batchSize==0) {
					statement.executeBatch();
					
				}
			}
			lineReader.close();
			statement.executeBatch();
			connection.commit();
			connection.close();
			System.out.println("Data has been inserted Succcessfully.");
		}
	catch(Exception e) {
		e.printStackTrace();
	}

	}

}
