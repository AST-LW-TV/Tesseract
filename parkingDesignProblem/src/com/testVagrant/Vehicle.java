package com.testVagrant;

import java.util.Date;

public class Vehicle {
    private String vehicleRegistrationNumber;
    private Date timeOfEntry;
    private String vehicleType;
    private String purposeOfVisit;

    public Vehicle(String vehicleRegistrationNumber,String vehicleType,
                    String purposeOfVisit){
        this.vehicleRegistrationNumber=vehicleRegistrationNumber;
        Date Entry = new Date();
        timeOfEntry = Entry;
        this.vehicleType=vehicleType;
        this.purposeOfVisit=purposeOfVisit;
    }

    public String getVehicleRegistrationNumber(){
        return this.vehicleRegistrationNumber;
    }

    public Date getTimeOfEntry(){
        return this.timeOfEntry;
    } // time format -> 1hr, 2hr

    public String getVehicleType(){
        return this.vehicleType;
    }

    public String getPurposeOfVisit(){
        return this.purposeOfVisit;
    }

}
