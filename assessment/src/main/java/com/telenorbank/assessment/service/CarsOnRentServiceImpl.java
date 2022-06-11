package com.telenorbank.assessment.service;

import com.telenorbank.assessment.entity.CarsOnRent;
import com.telenorbank.assessment.mapper.CarsOnRentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CarsOnRentServiceImpl implements CarsOnRentService {

    @Autowired
    private CarsOnRentMapper carsOnRentMapper;

    @Override
    public List<CarsOnRent> getAllCars() {
        List<CarsOnRent> list = carsOnRentMapper.getAllCars();
        return list;
    }

    @Override
    public List<CarsOnRent> getAllCarsByCustomerId(Long customerId) {
        return carsOnRentMapper.getAllCarsByCustomerId(customerId);
    }

    @Override
    public List<CarsOnRent> getAllAvailableCars() {
        List<CarsOnRent> list = carsOnRentMapper.getAllAvailableCars();
        return list;
    }

    @Override
    public void saveCar(CarsOnRent carsOnRent) {
        carsOnRentMapper.saveCar(carsOnRent);
    }

    @Override
    public void deleteCarByCarId(Long carRegistrationNumber) {
        carsOnRentMapper.deleteCarByCarId(carRegistrationNumber);
    }

    @Override
    public void updateCarStatus(Long carRegistrationNumber, String carHiringStatus) {
        carsOnRentMapper.updateCarStatus(carRegistrationNumber, carHiringStatus);
    }

    @Override
    public void updateCarCustomer(Long carRegistrationNumber, Long customerId) {
        carsOnRentMapper.updateCarCustomer(carRegistrationNumber, customerId);
    }
}