package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.cts.model.Customer;

public class CustomerDAOImpl implements CustomerDAO{
	Connection con=DBUtil.getConnection();
	PreparedStatement s;

	@Override
	public boolean addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		int n=0;
		try {
		String sql="insert into Customer_Master(fisrt_name,last_name,mobile_number,email,date_of_birth,pancard_number,aadhar_number,password) values (?,?,?,?,?,?,?,?)";
		s=con.prepareStatement(sql);
	    s.setString(1,cust.getFirstName());
	    s.setString(2,cust.getLastName());
	    s.setLong(3,cust.getMobileNumber());
	    s.setString(4,cust.getEmail());
	    s.setString(5,sdf.format(cust.getDob()));
	    s.setString(6,cust.getPanCardNumber());
	    s.setLong(7,cust.getAadharNumber());
	    s.setString(8,cust.getPassword());
		n = s.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(n!=0)
		{
			return true;
		}
		else
			
		return false;
	}

	@Override
	public boolean editCustomer(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> listAllCustomers() {
		// TODO Auto-generated method stub
        ArrayList<Customer>elist=new ArrayList<>();
		Connection con=DBUtil.getConnection();
		ResultSet rs=null;
		try {
			PreparedStatement s=con.prepareStatement("select * from Employee");
			rs=s.executeQuery();
			while(rs.next())
			{
				Customer c1=new Customer();
                c1.setCustomerId(rs.getInt(1));
                c1.setFirstName(rs.getString(2));
                c1.setLastName(rs.getString(3));
                c1.setMobileNumber(rs.getLong(4));
                c1.setEmail(rs.getString(5));
                c1.setDob(rs.getDate(6));
                c1.setPanCardNumber(rs.getString(7));
                c1.setAadharNumber(rs.getLong(8));
                c1.setPassword(rs.getString(9));
				elist.add(c1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return elist;
	}

}
