package com.cts.dao;

import java.util.List;

import com.cts.model.Customer;

public interface CustomerDAO {
	public boolean addCustomer(Customer cust);
	public boolean editCustomer(String email,String password);
	public List<Customer> listAllCustomers();
}
