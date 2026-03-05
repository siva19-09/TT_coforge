package com.coforge;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
public class Calculator
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        
        String uname = "root";
        String password = "Cfg@1234";
        String url= "jdbc:mysql://localhost:3306/cfgdb";
        Connection con = DriverManager.getConnection(url, uname, password);
        System.out.println("Connection established");
        
        String query = "{call add_numbers(?,?,?)}";
        CallableStatement cs = con.prepareCall(query);
        cs.setInt(1, 34);
        cs.setInt(2, 67);
        cs.registerOutParameter(3, Types.INTEGER);
        cs.execute();
        int sum = cs.getInt(3);
        System.out.println("Addition of two numbers: " + sum);
        
        String query2 = "{call sub_two_numbers(?,?,?)";
    	cs=con.prepareCall(query2);
    	cs.setInt(1, 39);
    	cs.setInt(2, 28);
    	cs.registerOutParameter(3, Types.INTEGER);
    	cs.execute();
    	int diff=cs.getInt(3);
    	System.out.println("difference: " +diff);
    	
    	String query3 = "{call mul_two_numbers(?,?,?)";
    	cs=con.prepareCall(query3);
    	cs.setInt(1, 5);
    	cs.setInt(2, 7);
    	cs.registerOutParameter(3, Types.INTEGER);
    	cs.execute();
    	int prod=cs.getInt(3);
    	System.out.println("product: " +prod);
    	
    	String query4 = "{call div_two_numbers(?,?,?)";
    	cs=con.prepareCall(query4);
    	cs.setInt(1, 25);
    	cs.setInt(2, 5);
    	cs.registerOutParameter(3, Types.INTEGER);
    	cs.execute();
    	int quot=cs.getInt(3);
    	System.out.println("Division: " + quot);
	}
}