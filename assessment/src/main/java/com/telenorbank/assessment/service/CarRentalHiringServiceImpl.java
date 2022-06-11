package com.telenorbank.assessment.service;

import com.telenorbank.assessment.entity.CarRentalHiring;
import com.telenorbank.assessment.mapper.CarRentalHiringMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CarRentalHiringServiceImpl implements CarRentalHiringService {

    @Autowired
    CarRentalHiringMapper carRentalHiringMapper;


    @Override
    public List<CarRentalHiring> getAllCarRentalHiring() {
        List<CarRentalHiring> list = carRentalHiringMapper.getAllCarRentalHiring();
        return list;
    }

    @Override
    public void hireCarOnRent(String type, String timeOfBooking, Long customerID) {
        carRentalHiringMapper.hireCarOnRent(type,timeOfBooking, customerID);
    }

    @Override
    public void saveCarRentalHiring(CarRentalHiring carRentalHiring) {
        carRentalHiringMapper.saveCarRentalHiring(carRentalHiring);
    }

    @Override
    public void deleteCarRentalHiringByCarRentalHiringId(@RequestBody Long carRentalHiringId) {
        carRentalHiringMapper.deleteCarRentalHiringByCarRentalHiringId(carRentalHiringId);
    }

    @Override
    public void updateCarRentalHiring(CarRentalHiring carRentalHiring) {
        carRentalHiringMapper.updateCarRentalHiring(carRentalHiring);
    }
}
