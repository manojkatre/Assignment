package com.myJdbcProject.Assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import myJdbcProject.ConnectionMaster;

public class highest_Salary {
	public static void main(String[] args)throws Exception {
		try {
	Connection conn=ConnectionMaster.getConnection();
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("SELECT MAX(SALARY) FROM EMPLOYEE");
	while(rs.next())
		
		
		System.out.println(rs.getInt(1));

	
}catch(Exception ex){
	System.out.println(ex.getMessage());
}
{ 
	
}
}
	       
}
