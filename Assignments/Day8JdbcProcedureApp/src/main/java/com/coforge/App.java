package com.coforge;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/**
 * Hello world!
 */
public class App
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
        
        String query = "{call get_all_students()}";
        CallableStatement cs = con.prepareCall(query);
        
        ResultSet rs = cs.executeQuery(query);
        System.out.println("Student Data");
        System.out.println("******************");
        ResultSetMetaData rsmd = rs.getMetaData();
        int count = rsmd.getColumnCount();
        for(int i = 1; i <= count; i++)
        {
        	System.out.println(rsmd.getColumnName(i) + "  " + rsmd.getColumnTypeName(i));
        }
        while(rs.next())
        {
        	System.out.println("stdid : " + rs.getInt(rsmd.getColumnName(1)));
        	System.out.println("stdname : " + rs.getString(rsmd.getColumnName(2)));
        	System.out.println("Marks: " + rs.getDouble(rsmd.getColumnName(3)));
        	System.out.println("Mobile: " + rs.getString(rsmd.getColumnName(4)));
        	System.out.println("***********************");
        }
    }
}