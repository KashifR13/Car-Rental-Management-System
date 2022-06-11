package com.telenorbank.assessment.controller;

import com.telenorbank.assessment.entity.CarsOnRent;
import com.telenorbank.assessment.entity.Customer;
import com.telenorbank.assessment.service.CarsOnRentService;
import com.telenorbank.assessment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class CustomerController {

    @Autowired
    private CustomerService CustomerService;
    @Autowired
    private CarsOnRentService carsOnRentService;

    @GetMapping("/getAllCustomer")
    public List<Customer> getAllCustomer() {
        List<Customer> customerList = CustomerService.getAllCustomer();
        return customerList;
    }

    // This is the API to return customer's rides history
    @GetMapping("/getCustomerHistory")
    public Customer getCustomerById(Long customerId) {
        Customer customer = CustomerService.getCustomerById(customerId);
        customer.setCarsList(carsOnRentService.getAllCarsByCustomerId(customerId));
        return customer;
    }

    //Bonus: This API returns the rides that are cancelled after booking
    @GetMapping("/getCancelledRidesOfCustomer")
    public Customer getCustomerCanceledRides(Long customerId) {
        Customer customer = CustomerService.getCustomerById(customerId);
        List<CarsOnRent> carsOnRent = carsOnRentService.getAllCarsByCustomerId(customerId);

        List<CarsOnRent> cancelledCars = carsOnRent.stream().
                filter(it->it.getCarHiringStatus().equals("Cancelled".toString()))
                        .collect(Collectors.toList());

        customer.setCarsList(cancelledCars);
        return customer;
    }

    @PostMapping("/saveCustomer")
    public void saveCustomer(@RequestBody Customer customer) {
        CustomerService.saveCustomer(customer);
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomerById(@PathVariable("id") Long id) {
        CustomerService.deleteCustomerByCustomerId(id);
    }

    @PutMapping("/updateCustomer")
    public void updateCustomer(@RequestBody Customer customer) {
        CustomerService.updateCustomer(customer);
    }
}
