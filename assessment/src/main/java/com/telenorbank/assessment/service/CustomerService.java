package com.telenorbank.assessment.service;

import com.telenorbank.assessment.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomer();
    public Customer getCustomerById(Long customerID);
    public void saveCustomer(Customer  customer);
    public void deleteCustomerByCustomerId(Long customerId);
    public void updateCustomer(Customer customer);

}