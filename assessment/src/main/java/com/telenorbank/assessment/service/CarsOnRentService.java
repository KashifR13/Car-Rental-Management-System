package com.telenorbank.assessment.service;

import com.telenorbank.assessment.entity.CarsOnRent;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CarsOnRentService {

    public List<CarsOnRent> getAllCars();
    public List<CarsOnRent> getAllCarsByCustomerId(Long customerId);
    public List<CarsOnRent> getAllAvailableCars();
    public void saveCar(CarsOnRent carsOnRent);
    public void deleteCarByCarId(Long carRegistrationNumber);
    public void updateCarStatus(Long carRegistrationNumber, String carHiringStatus);
    public void updateCarCustomer(Long carRegistrationNumber, Long customerId);


}
