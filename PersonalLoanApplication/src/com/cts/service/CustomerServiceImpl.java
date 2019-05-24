package com.cts.service;

import java.util.List;

import com.cts.dao.CustomerDAO;
import com.cts.dao.CustomerDAOImpl;
import com.cts.model.Customer;

public class CustomerServiceImpl implements CustomerService{
    CustomerDAO customerDAO;
    public CustomerServiceImpl()
	{
		customerDAO=new CustomerDAOImpl();
	}
	@Override
	public boolean addService(Customer cust) {
		// TODO Auto-generated method stub
		if(customerDAO.addCustomer(cust))
		    return true;
		else 
			return false;
	}

	@Override
	public boolean editService(String email, String password) {
		// TODO Auto-generated method stub
		if(customerDAO.editCustomer(email,password))
		    return true;
		else 
			return false;
	}

	@Override
	public List<Customer> listAllService() {
		// TODO Auto-generated method stub
		return customerDAO.listAllCustomers();
	}

}
