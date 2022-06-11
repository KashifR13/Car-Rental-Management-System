package com.telenorbank.assessment.controller;

import com.telenorbank.assessment.AssessmentApplication;
import com.telenorbank.assessment.entity.CarRentalHiring;
import com.telenorbank.assessment.entity.CarsOnRent;
import com.telenorbank.assessment.service.CarRentalHiringService;
import com.telenorbank.assessment.service.CarsOnRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class CarRentalHiringController {

    @Autowired
    private CarRentalHiringService carRentalHiringService;
    @Autowired
    private CarsOnRentService carsOnRentService;

    @GetMapping("/hirings")
    public List<CarRentalHiring> getAllCarRentalHiring() {
        List<CarRentalHiring> carRentalHiringList = carRentalHiringService.getAllCarRentalHiring();
        return carRentalHiringList;
    }

    @PostMapping("/hirings")
    public void saveCarRentalHiring(CarRentalHiring carRentalHiring){
        carRentalHiringService.saveCarRentalHiring(carRentalHiring);
    }

    // This API is written to hire a car on rent from all the available cars
    @PostMapping("/hireCarOnRent")
    public void hireCarOnRent(String codeType, String timeOfBooking, Long customerId)
            throws ParseException, IOException {

        CarRentalHiring carRentalHiring;
        List<CarsOnRent> list = carsOnRentService.getAllAvailableCars();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
        Date dateTime = dateFormat.parse(timeOfBooking);
        String strTime = dateFormat.format(dateTime);

        int pricePerHour = AssessmentApplication.priceOfBooking(strTime);

        CarsOnRent carsOnRent = new CarsOnRent();

        if (codeType.equals("basic".toString())) {

            List<CarsOnRent> carsOnRentWithBasicCategory =
                    list.stream().filter(it->it.getCarEnginePowerInCC() < 800)
                            .collect(Collectors.toList());

            if (!carsOnRentWithBasicCategory.isEmpty()) { carsOnRent = carsOnRentWithBasicCategory.get(0);}
            else {System.out.println("SORRY :( \nCurrently no cars are available in the Basic Category!"); return;}

        }

        if (codeType.equals("business".toString())) {

            List<CarsOnRent> carsOnRentWithBusinessCategory =
                    list.stream().filter(it->it.getCarEnginePowerInCC() > 1000 && it.getCarMileageInKMs() > 30000)
                            .collect(Collectors.toList());

            if (!carsOnRentWithBusinessCategory.isEmpty()) { carsOnRent = carsOnRentWithBusinessCategory.get(0);}
            else {System.out.println("SORRY :( \nCurrently no cars are available in the Business Category!"); return;}

        }

        if(codeType.equals("businessPlus".toString())) {

            List<CarsOnRent> carsOnRentWithBusinessPlusCategory =
                    list.stream().filter(it->it.getCarEnginePowerInCC() > 1000 && it.getCarMileageInKMs() < 30000)
                            .collect(Collectors.toList());

            if (!carsOnRentWithBusinessPlusCategory.isEmpty()) { carsOnRent=carsOnRentWithBusinessPlusCategory.get(0);}
            else {System.out.println("SORRY :( \nCurrently no cars are available in the BusinessPlus Category!"); return;}

        }

        carRentalHiring = new CarRentalHiring (
                pricePerHour, codeType, timeOfBooking.toString(), carsOnRent.getCarRegistrationNumber(), customerId
        );

        carRentalHiringService.saveCarRentalHiring(carRentalHiring);
        carsOnRentService.updateCarCustomer(carsOnRent.getCarRegistrationNumber(), customerId);
        carsOnRentService.updateCarStatus(carsOnRent.getCarRegistrationNumber(), "Booked");

    }

    @DeleteMapping("/hirings")
    public void deleteCarRentalHiringByCarRentalHiringId(@PathVariable("id") Long carRentalHiringId) {
        carRentalHiringService.deleteCarRentalHiringByCarRentalHiringId(carRentalHiringId);
    }
}
