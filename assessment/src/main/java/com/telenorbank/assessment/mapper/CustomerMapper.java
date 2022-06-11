package com.telenorbank.assessment.mapper;

import com.telenorbank.assessment.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {

    public List<Customer> getAllCustomer();
    public Customer getCustomerById(Long customerID);
    public void saveCustomer(Customer customer);
    public void deleteCustomerByCustomerId(Long customerId);
    public void updateCustomer(Customer customer);

}