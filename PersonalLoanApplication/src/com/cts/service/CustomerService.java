package com.cts.service;

import java.util.List;

import com.cts.model.Customer;

public interface CustomerService {
	public boolean addService(Customer cust);
	public boolean editService(String email,String password);
	public List<Customer> listAllService();
}
