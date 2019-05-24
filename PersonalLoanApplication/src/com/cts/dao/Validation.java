package com.cts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validation {
	public static boolean checkUser(String email,String pass) 
    {
     boolean st =false;
     try{
	 //creating connection with the database 
        Connection con= DBUtil.getConnection();
        String sql="select * from Customer_Master where email=? and password=?";
        PreparedStatement ps =con.prepareStatement(sql);
        ps.setString(1, email);
        ps.setString(2, pass);
        ResultSet rs =ps.executeQuery();
        st = rs.next();
     }catch(Exception e)
     {
         e.printStackTrace();
     }
        return st;                 
 }   
	public static boolean checkEmployee(String email,String pass) 
    {
     boolean st =false;
     try{
	 //creating connection with the database 
        Connection con= DBUtil.getConnection();
        String sql="select * from Employee_Master where email=? and pass=?";
        PreparedStatement ps =con.prepareStatement(sql);
        ps.setString(1, email);
        ps.setString(2, pass);
        ResultSet rs =ps.executeQuery();
        st = rs.next();
       
     }catch(Exception e)
     {
         e.printStackTrace();
     }
        return st;                 
 }   
}
