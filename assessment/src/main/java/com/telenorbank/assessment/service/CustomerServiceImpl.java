package com.telenorbank.assessment.service;

import com.telenorbank.assessment.entity.Customer;
import com.telenorbank.assessment.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper CustomerMapper;

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> list = CustomerMapper.getAllCustomer();
        return list;
    }

    @Override
    public Customer getCustomerById(Long customerID) {
        return CustomerMapper.getCustomerById(customerID);
    }

    @Override
    public void saveCustomer(Customer Customer) {
        CustomerMapper.saveCustomer(Customer);
    }

    @Override
    public void deleteCustomerByCustomerId(@RequestBody Long customerId) {
        CustomerMapper.deleteCustomerByCustomerId(customerId);
    }

    @Override
    public void updateCustomer(Customer Customer) {
        CustomerMapper.updateCustomer(Customer);
    }
}