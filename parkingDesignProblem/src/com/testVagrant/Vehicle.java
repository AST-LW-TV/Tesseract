package com.testVagrant;

import java.util.Date;

public class Vehicle {
    private String vehicleRegistrationNumber;
    private long timeOfEntry;
    private String vehicleType;
    private String purposeOfVisit;

    public Vehicle(String vehicleRegistrationNumber,String vehicleType,String purposeOfVisit){
        this.timeOfEntry = this.setTimeOfEntry(); // initialising time stamp when the vehicle is entered
        this.vehicleRegistrationNumber=vehicleRegistrationNumber;
        this.vehicleType=vehicleType;
        this.purposeOfVisit=purposeOfVisit;
    }

    public String getVehicleRegistrationNumber(){
        return this.vehicleRegistrationNumber;
    }

    public long getTimeOfEntry(){
        return this.timeOfEntry;
    }

    public String getVehicleType(){
        return this.vehicleType;
    }

    public String getPurposeOfVisit(){
        return this.purposeOfVisit;
    }

    public long setTimeOfEntry(){
        Date Entry=new Date();
        return Entry.getTime();
    }

}
