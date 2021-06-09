package com.testVagrant;

public class Vehicle {
    private String vehicleRegistrationNumber;
    private String timeOfEntry;
    private String vehicleType;
    private String purposeOfVisit;

    public Vehicle(String vehicleRegistrationNumber,String timeOfEntry,String vehicleType,
                    String purposeOfVisit){
        this.vehicleRegistrationNumber=vehicleRegistrationNumber;
        this.timeOfEntry=timeOfEntry;
        this.vehicleType=vehicleType;
        this.purposeOfVisit=purposeOfVisit;
    }

    public String getVehicleRegistrationNumber(){
        return this.vehicleRegistrationNumber;
    }

    public String getTimeOfEntry(){
        return this.timeOfEntry;
    } // time format -> 1hr, 2hr

    public String getVehicleType(){
        return this.vehicleType;
    }

    public String getPurposeOfVisit(){
        return this.purposeOfVisit;
    }

}
