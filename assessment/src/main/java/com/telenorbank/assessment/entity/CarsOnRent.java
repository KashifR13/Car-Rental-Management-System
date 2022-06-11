package com.telenorbank.assessment.entity;

import java.io.Serializable;

public class CarsOnRent implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long carRegistrationNumber;
    private String carBrandName;
    private String carModelName;
    private int carEnginePowerInCC;
    private int carMileageInKMs;
    private String carHiringStatus;
    private int customerId;

    private Customer customer;

    public CarsOnRent() {
        super();
    }

    public CarsOnRent(Long carRegistrationNumber, String carBrandName, String carModelName, int carEnginePowerInCC, int carMileageInKMs, String carHiringStatus, int customerId) {
        this.carRegistrationNumber = carRegistrationNumber;
        this.carBrandName = carBrandName;
        this.carModelName = carModelName;
        this.carEnginePowerInCC = carEnginePowerInCC;
        this.carMileageInKMs = carMileageInKMs;
        this.carHiringStatus = carHiringStatus;
        this.customerId = customerId;
    }

    public Long getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public void setCarRegistrationNumber(Long carRegistrationNumber) {
        this.carRegistrationNumber = carRegistrationNumber;
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public String getCarModelName() {
        return carModelName;
    }

    public void setCarModelName(String carModelName) {
        this.carModelName = carModelName;
    }

    public int getCarEnginePowerInCC() {
        return carEnginePowerInCC;
    }

    public void setCarEnginePowerInCC(int carEnginePowerInCC) {
        this.carEnginePowerInCC = carEnginePowerInCC;
    }

    public int getCarMileageInKMs() {
        return carMileageInKMs;
    }

    public void setCarMileageInKMs(int carMileageInKMs) {
        this.carMileageInKMs = carMileageInKMs;
    }

    public String getCarHiringStatus() {
        return carHiringStatus;
    }

    public void setCarHiringStatus(String carHiringStatus) {
        this.carHiringStatus = carHiringStatus;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "CarsOnRent{" +
                "carRegistrationNumber=" + carRegistrationNumber +
                ", carBrandName='" + carBrandName + '\'' +
                ", carModelName='" + carModelName + '\'' +
                ", carEnginePowerInCC=" + carEnginePowerInCC +
                ", carMileageInKMs=" + carMileageInKMs +
                ", carHiringStatus='" + carHiringStatus + '\'' +
                ", customerId=" + customerId +
                ", customer=" + customer +
                '}';
    }
}

