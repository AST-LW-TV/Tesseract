package com.testVagrant;

import java.util.*;

public class TollGate {

    ParkingSlots parkingSlots=new ParkingSlots(500,200,300);
    AmountCollection amountCollection=new AmountCollection(0.1f);

    public void entry(){
    	
    	Details details=new Details();
        String[] temp=details.returnDetails();
        Vehicle vehicle=new Vehicle(temp[0],temp[1],temp[2]);
        boolean checkTheAvailability=parkingSlots.setParking(vehicle.getVehicleType());
        if(checkTheAvailability==true){
            parkingSlots.parkTheVehicle(vehicle);
            System.out.println("Vehicle is Parked");
            System.out.println(vehicle.getTimeOfEntry());
        }else if(checkTheAvailability==false){
            System.out.println("The Parking is FULL");
        }
    }

    public void exit(){
    	Date exitTime;
        System.out.println("Enter the Vehicle Registration Number: ");
        Scanner input=new Scanner(System.in);
        String vehicleRegistrationNumber=input.nextLine();
        Vehicle vehicleExiting=parkingSlots.searchTheVehicle(vehicleRegistrationNumber);
        if(vehicleExiting!=null){
        	exitTime = new Date();
            amountCollection.setTheVehicle(vehicleExiting,exitTime);
            System.out.println("Exit time is"+exitTime);
            long durationParked=exitTime.getTime()-vehicleExiting.getTimeOfEntry().getTime();
            System.out.println("Total Parking time is "+((durationParked/1000)%60)+" seconds");
        }
        else{
            System.out.println("The Vehicle with this Number is not Parked");
            System.out.println("Illegal Entry...");
        }
    }

}
