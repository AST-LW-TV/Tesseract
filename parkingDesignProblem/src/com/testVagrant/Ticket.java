package com.testVagrant;

import java.util.Date;
import java.util.Scanner;

public class Ticket {
    private String vehicleRegistrationNumber;
    private String vehicleType;
    private long timeOfEntry;

    Scanner input=new Scanner(System.in);

    public Ticket(String vehicleType){
        this.vehicleRegistrationNumber=this.setVehicleRegistration();
        this.vehicleType=vehicleType;
        this.timeOfEntry=this.setTimeOfEntry();
    }

    public String setVehicleRegistration(){
        System.out.println("Enter the Vehicle Registration Number: ");
        return input.nextLine();
    }

    public long setTimeOfEntry(){
        Date entry=new Date();
        return entry.getTime();
    }

    public String getVehicleType(){
        return this.vehicleType;
    }

    public String getVehicleRegistrationNumber(){
        return this.vehicleRegistrationNumber;
    }

    public long getEntryTime(){
        return this.timeOfEntry;
    }
}
