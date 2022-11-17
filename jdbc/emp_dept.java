package com.myJdbcProject.Assignment;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.util.Scanner;

import myJdbcProject.ConnectionMaster;

	public class emp_dept {
	public static void main(String[] args) {
		try {
	        Scanner sc = new Scanner(System.in);
	       
	        Connection conn = ConnectionMaster.getConnection();
	        PreparedStatement pst = conn.prepareStatement("....");
	        System.out.println("please enter id");
	        pst.setInt(1, Integer.parseInt(sc.nextLine()));
	       
	        
	        //execute the update
	        pst.executeUpdate();
	        
	        //close the connection
	        conn.close();
	    }catch(Exception ex) {
	        System.out.println(ex.getMessage());
	    }
	}
	}


