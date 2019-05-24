package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.dao.DBUtil;
import com.cts.model.Customer;

@WebServlet("/EmployeeRegistrationServlet")
public class EmployeeRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	PreparedStatement s=null;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		con=DBUtil.getConnection();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			PrintWriter pw=response.getWriter();
	
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			String fname=request.getParameter("firstname");
			String lname=request.getParameter("lastname");
			long mobile=Long.parseLong(request.getParameter("number"));
			String email=request.getParameter("email");
			String designation=request.getParameter("desig");
			String pan=request.getParameter("PanNumber");
			long aadhaar=Long.parseLong(request.getParameter("AadharNumber"));
			String dob =request.getParameter("dob");
			String pwd=request.getParameter("pwd");
			
			String sql="insert into Employee_Master(fisrt_name,last_name,mobile_number,email,designation,date_of_birth,pancard_number,aadhar_number,password) values (?,?,?,?,?,?,?,?,?)";
			s=con.prepareStatement(sql);
		    s.setString(1,fname);
		    s.setString(2,lname);
		    s.setLong(3,mobile);
		    s.setString(4,email);
		    s.setString(5,designation);
		    s.setString(6, dob);
		    s.setString(7,pan);
		    s.setLong(8,aadhaar);
		    s.setString(9, pwd);
			int n=s.executeUpdate();
			if(n!=0)
			{
				pw.write("Employee registered successfully");
			}
			else
				pw.write("OOps!!Employee details are not registered");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
