package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.dao.DBUtil;
import com.cts.dao.Validation;
import com.cts.model.Customer;

@WebServlet("/CustomerLoginServlet")
public class CustomerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Connection con=null;
	PreparedStatement s=null;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		con=DBUtil.getConnection();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		    
		    String email = request.getParameter("email");
		    String pass = request.getParameter("pass");
	
		    
		    if(Validation.checkUser(email, pass))
		    {
		    	HttpSession session=request.getSession(true);  
	    		session.setAttribute("user",email.substring(1, email.indexOf('@')));
		        RequestDispatcher rs = request.getRequestDispatcher("welcome.html");
		        rs.forward(request, response);
		    }
		    else
		    {
		       out.println("Username or Password incorrect");
		       RequestDispatcher rs = request.getRequestDispatcher("CustomerLogin.jsp");
		       rs.include(request, response);
		    }
	}
	}
