package com.telenorbank.assessment.service;

import com.telenorbank.assessment.entity.CarRentalHiring;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CarRentalHiringService {

    public List<CarRentalHiring> getAllCarRentalHiring();
    public  void hireCarOnRent(String type, String timeOfBooking, Long customerID);
    public void saveCarRentalHiring(CarRentalHiring carRentalHiring);
    public void deleteCarRentalHiringByCarRentalHiringId(Long carRentalHiringId);
    public void updateCarRentalHiring(CarRentalHiring carRentalHiring);

}
