package com.telenorbank.assessment.mapper;

import com.telenorbank.assessment.entity.CarRentalHiring;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarRentalHiringMapper {

    public List<CarRentalHiring> getAllCarRentalHiring();
    public void saveCarRentalHiring(CarRentalHiring carRentalHiring);
    public  void hireCarOnRent(String type, String timeOfBooking, Long customerID);
    public void deleteCarRentalHiringByCarRentalHiringId(Long carRentalHiringId);
    public void updateCarRentalHiring(CarRentalHiring carRentalHiring);

}
