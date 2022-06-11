package com.telenorbank.assessment.entity;

import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long customerId;
    private String customerName;
    private Long customerMobileNumber;

    private List<CarsOnRent> carsOnRentList;

    public Customer() {
        super();
    }

    public Customer(Long customerId, String customerName, Long customerMobileNumber, List<CarsOnRent> carsOnRentList) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerMobileNumber = customerMobileNumber;
        this.carsOnRentList = carsOnRentList;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public void setCustomerMobileNumber(Long customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public List<CarsOnRent> getCarsList() {
        return carsOnRentList;
    }

    public void setCarsList(List<CarsOnRent> carsOnRentList) {
        this.carsOnRentList = carsOnRentList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerMobileNumber=" + customerMobileNumber +
                ", carsList=" + carsOnRentList +
                '}';
    }
}