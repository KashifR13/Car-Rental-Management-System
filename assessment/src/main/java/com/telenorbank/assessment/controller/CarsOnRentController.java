package com.telenorbank.assessment.controller;

import com.telenorbank.assessment.entity.CarsOnRent;
import com.telenorbank.assessment.service.CarsOnRentService;
import com.telenorbank.assessment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CarsOnRentController {

    @Autowired
    private CarsOnRentService carsOnRentService;
    @Autowired
    private CustomerService customerService;

    @GetMapping("/cars")
    public List<CarsOnRent> getAllCars() {
        List<CarsOnRent> carsOnRentList = carsOnRentService.getAllCars();
        return carsOnRentList;
    }

    @GetMapping("/carsAvailable")
    public List<CarsOnRent> getAllAvailableCars() {
        List<CarsOnRent> carsOnRentList = carsOnRentService.getAllAvailableCars();
        return carsOnRentList;
    }

    @GetMapping("/carsRentedByCustomer")
    public List<CarsOnRent> getAllCarsByCustomerId(Long customerId) {
        List<CarsOnRent> carsOnRents = carsOnRentService.getAllCarsByCustomerId(customerId);
        return carsOnRents;
    }

    @PostMapping("/cars")
    public void saveCar(CarsOnRent carsOnRent) {
        System.out.println(carsOnRent.getCarRegistrationNumber());
        carsOnRentService.saveCar(carsOnRent);
    }

    @DeleteMapping("/cars")
    public void deleteCarById(@PathVariable("id") Long carRegistrationNumber) {
        carsOnRentService.deleteCarByCarId(carRegistrationNumber);
    }

    // Updates the Status of Hiring
    @PutMapping("/carStatus")
    public void updateCarStatus(Long carRegistrationNumber, String carHiringStatus) {
        carsOnRentService.updateCarStatus(carRegistrationNumber, carHiringStatus);
    }

    // Updates the Customer against Hiring
    @PutMapping("/carCustomer")
    public void updateCarCustomer(Long carRegistrationNumber, Long customerId) {
        carsOnRentService.updateCarCustomer(carRegistrationNumber, customerId);
    }
}
