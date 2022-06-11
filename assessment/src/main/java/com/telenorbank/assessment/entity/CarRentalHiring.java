package com.telenorbank.assessment.entity;

public class CarRentalHiring {
    private int carRentalHiringId;
    private int carRentalPricePerHour;
    private String carHiringType;
    private String carBookingTime;
    private Long carRegistrationNumber;
    private Long customerId;


    public CarRentalHiring() {
        super();
    }

    public CarRentalHiring(int carRentalPricePerHour, String carHiringType, String carBookingTime, Long carRegistrationNumber, Long customerId) {
        this.carRentalPricePerHour = carRentalPricePerHour;
        this.carHiringType = carHiringType;
        this.carBookingTime = carBookingTime;
        this.carRegistrationNumber = carRegistrationNumber;
        this.customerId = customerId;
    }

    public int getCarRentalHiringId() {
        return carRentalHiringId;
    }

    public void setCarRentalHiringId(int carRentalHiringId) {
        this.carRentalHiringId = carRentalHiringId;
    }

    public int getCarRentalPricePerHour() {
        return carRentalPricePerHour;
    }

    public void setCarRentalPricePerHour(int carRentalPricePerHour) {
        this.carRentalPricePerHour = carRentalPricePerHour;
    }

    public String getCarHiringType() {
        return carHiringType;
    }

    public void setCarHiringType(String carHiringType) {
        this.carHiringType = carHiringType;
    }

    public String getCarBookingTime() {
        return carBookingTime;
    }

    public void setCarBookingTime(String carBookingTime) {
        this.carBookingTime = carBookingTime;
    }

    public Long getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public void setCarRegistrationNumber(Long carRegistrationNumber) {
        this.carRegistrationNumber = carRegistrationNumber;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "CarRentalHiring{" +
                "carRentalHiringId=" + carRentalHiringId +
                ", carRentalPricePerHour=" + carRentalPricePerHour +
                ", carHiringType='" + carHiringType + '\'' +
                ", carBookingTime='" + carBookingTime + '\'' +
                ", carRegistrationNumber=" + carRegistrationNumber +
                ", customerId=" + customerId +
                '}';
    }
}
