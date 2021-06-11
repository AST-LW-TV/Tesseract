package com.testVagrant;

import com.testVagrant.setup.Input;

import java.util.Date;

public class TollGate {

    // entry issues ticket ...
    // returns Ticket Object
    public Ticket entry() {
        System.out.println("Enter the Vehicle Type: ");
        String vehicleType = Input.giveInput();
        boolean parkingIsAvailable = ParkingSlots.checkParking(vehicleType);
        if (parkingIsAvailable) {
            Ticket ticket = new Ticket(vehicleType);  // ticket is issued only of parking is available
            return ticket;
        } else {
            return null;
        }
    }

    // exist takes the ticket and calculates the price to be paid ...
    public void exit(Ticket ticket) {
        System.out.println("The Vehicle with " + ticket.getVehicleRegistrationNumber() + " is Exiting");
        Date exitTime = new Date();
        System.out.println("Enter the Purpose of Visit: ");
        String purposeOfVisit = Input.giveInput();
        System.out.println("Thank You, Your Exit time is " + exitTime);
        double priceForVehicle = AmountCollection.calculateAmount(ticket, exitTime.getTime(), purposeOfVisit);
        System.out.println("Amount to Paid for Parking: " + Math.round(priceForVehicle) + "\n");
    }

}


