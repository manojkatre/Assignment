package com.myJdbcProject.Assignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import myJdbcProject.ConnectionMaster;

public class gender_of_employee {
	public static void main(String[] args) {
        try {
            Connection conn = ConnectionMaster.getConnection();
            Statement st = conn.createStatement();



           ResultSet rs = st.executeQuery("select gender,avg(salary) from employee group by gender ");
            System.out.println("The average salary of males and females in organisation is :");
            while (rs.next())
                System.out.println( rs.getString(1)+" average salary is  "+rs.getInt(2));



       } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }



   }
}
