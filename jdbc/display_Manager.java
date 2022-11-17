package com.myJdbcProject.Assignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import myJdbcProject.ConnectionMaster;

public class display_Manager {
	public static void main(String[] args)throws Exception {
		try {
	Connection conn=ConnectionMaster.getConnection();
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("select * from employee where designation='manager'");
	while(rs.next())
		
		System.out.println(rs.getInt(1)+" " +rs.getString(2)+" "+rs.getInt(3)+" " +rs.getInt(4)+" " +rs.getString(5));

	}catch(Exception ex){
	System.out.println(ex.getMessage());
}

}
	       

}
