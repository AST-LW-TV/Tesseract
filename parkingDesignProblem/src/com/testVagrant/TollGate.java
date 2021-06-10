package com.testVagrant;

import java.util.*;

public class TollGate {

    ParkingSlots parkingSlots=new ParkingSlots(500,200,300); // set the total and individual slots
    AmountCollection amountCollection=new AmountCollection(0.1f); // set the discount price

    public void entry(){
    	Details details=new Details();
        String[] temp=details.returnDetails();
        Vehicle vehicle=new Vehicle(temp[0],temp[1],temp[2]);
        boolean checkTheAvailability=parkingSlots.setParking(vehicle.getVehicleType());
        if(checkTheAvailability==true){
            parkingSlots.parkTheVehicle(vehicle);
            System.out.println("Vehicle is Parked");
            System.out.println("Rest Assured and Enjoy your Visit "+new String(Character.toChars(0X1F44A))+"\n");
        }else if(checkTheAvailability==false){
            System.out.println("The Parking is FULL, Your Vehicle Missed the Best Place "+new String(Character.toChars(0X1F614))+"\n");
        }
    }

    public void exit(){
    	Date exitTime; // defining exitTime object
        System.out.println("Enter the Vehicle Registration Number: ");
        Scanner input=new Scanner(System.in);
        String vehicleRegistrationNumber=input.nextLine();
        Vehicle vehicleExiting=parkingSlots.searchTheVehicle(vehicleRegistrationNumber);
        if(vehicleExiting!=null){
        	exitTime = new Date();  // taking exit time into account
            amountCollection.setTheVehicle(vehicleExiting,exitTime.getTime()); // all parking slots increments are done here
            System.out.println("Thank You, Your Exit time is "+exitTime);
            double priceForVehicle=amountCollection.calculateAmount();
            System.out.println("Amount to Paid for Parking: "+Math.round(priceForVehicle)+"\n");
        }
        else{
            System.out.println("The Vehicle with this Number is not Parked");
            System.out.println("Illegal Entry...");
            System.out.println("Pay the fine ");
            System.out.println(new String(Character.toChars(0x1F632))+"\n");
        }
    }

}
