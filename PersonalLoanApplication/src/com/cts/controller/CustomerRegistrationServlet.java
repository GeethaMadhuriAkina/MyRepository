package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.dao.DBUtil;
import com.cts.model.Customer;
import com.cts.service.CustomerService;
import com.cts.service.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerRegistrationServlet
 */
@WebServlet("/CustomerRegistrationServlet")
public class CustomerRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	PreparedStatement s=null;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		con=DBUtil.getConnection();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();

		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		long mobile=Long.parseLong(request.getParameter("number"));
		String email=request.getParameter("email");
		String pan=request.getParameter("PanNumber");
		long aadhaar=Long.parseLong(request.getParameter("AadharNumber"));
		String dob =request.getParameter("dob");
		String pwd=request.getParameter("pwd");
		
		
		Customer c1=new Customer();
		c1.setFirstName(fname);
		c1.setLastName(lname);
		c1.setMobileNumber(mobile);
		c1.setEmail(email);
		try {
			c1.setDob(sdf.parse(dob));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c1.setPanCardNumber(pan);
		c1.setAadharNumber(aadhaar);
		c1.setPassword(pwd);
		CustomerService cs=new CustomerServiceImpl();
		if(cs.addService(c1))
			pw.write("Customer Registered successfully");
		else
			pw.write("OOps!!Customer could not be  Registered");
			
	}
	}
