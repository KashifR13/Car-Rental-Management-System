package com.telenorbank.assessment.mapper;

import com.telenorbank.assessment.entity.CarsOnRent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarsOnRentMapper {

    public List<CarsOnRent> getAllCars();
    public List<CarsOnRent> getAllCarsByCustomerId(Long customerId);
    public List<CarsOnRent> getAllAvailableCars();
    public void saveCar(CarsOnRent carsOnRent);
    public void deleteCarByCarId(Long carRegistrationNumber);
    public void updateCarStatus(Long carRegistrationNumber, String carHiringStatus);
    public void updateCarCustomer(Long carRegistrationNumber, Long customerId);

}
