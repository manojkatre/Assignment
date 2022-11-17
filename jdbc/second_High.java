package com.myJdbcProject.Assignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import myJdbcProject.ConnectionMaster;
public class second_High {

	public static void main(String[] args)throws Exception {
		try {
	Connection conn=ConnectionMaster.getConnection();
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("SELECT ename, MAX(salary)AS salary FROM employee WHERE salary<(SELECT MAX(salary)FROM employee)");
	while(rs.next())
		
		
		System.out.println(rs.getString(1)+" "+rs.getInt(2));

	
}catch(Exception ex){
	System.out.println(ex.getMessage());
}

	
}
}
	       


