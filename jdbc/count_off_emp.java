package com.myJdbcProject.Assignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import myJdbcProject.ConnectionMaster;

public class count_off_emp {
	public static void main(String[] args) {
        try {
            Connection conn = ConnectionMaster.getConnection();
            Statement st = conn.createStatement();



           ResultSet rs = st.executeQuery(" select designation,count(*) from employee group by designation");
            System.out.println("The count of employees in each department");
            while (rs.next())
                System.out.println( rs.getString(1)+"  "+rs.getInt(2));



       } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }



   }
}
