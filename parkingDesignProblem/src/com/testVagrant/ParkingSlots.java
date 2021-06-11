package com.testVagrant;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ParkingSlots {

    private static int totalNumberOfSlots;
    private static int bikeParkingSlots;
    private static int carParkingSlots;

    private static List<Ticket> parkingArea = new ArrayList<>();  // parking area is public

    public ParkingSlots() {
        this.bikeParkingSlots = 200;
        this.carParkingSlots = 300;
        this.totalNumberOfSlots = this.bikeParkingSlots + this.carParkingSlots;
    }

    public ParkingSlots(int totalSlots, int bikeSlots, int carSlots) {
        this.totalNumberOfSlots = totalSlots;
        this.bikeParkingSlots = bikeSlots;
        this.carParkingSlots = carSlots;
    }

    // gets the free slots ...
    public String getTotalFreeSlots() {
        return "Total Free Slots " + this.totalNumberOfSlots + " Among them, Cars have "
                + this.carParkingSlots + " and Bikes have " + this.bikeParkingSlots;
    }

    // Checking the availability of parking
    // returns boolean
    public static boolean checkParking(String vehicleType) {
        boolean isAvailable = false;
        if (vehicleType.equals("car"))
            isAvailable = carParkingSlots > 0 ? true : false;
        if (vehicleType.equals("bike"))
            isAvailable = bikeParkingSlots > 0 ? true : false;
        return isAvailable;
    }

    // Parking the vehicle
    // vehicle parks in the slot after ticket is issued
    public void parkTheVehicle(Ticket ticket) {
        this.parkingArea.add(ticket);
        totalNumberOfSlots -= 1;
        if (ticket.getVehicleType().equals("car"))
            carParkingSlots -= 1;
        else if (ticket.getVehicleType().equals("bike"))
            bikeParkingSlots -= 1;
    }

    // Exiting the vehicle
    // this method is simulated and automatically gets the vehicle and sends it to the exiting toll ...
    // returns ticket
    public static Ticket getTheVehicle() {
        int length = parkingArea.size();
        int randomVehicle = new Random().nextInt(length);
        Ticket ticket = parkingArea.get(randomVehicle);
        parkingArea.remove(randomVehicle);
        totalNumberOfSlots += 1;
        if (ticket.getVehicleType().equals("car"))
            carParkingSlots += 1;
        else if (ticket.getVehicleType().equals("bike"))
            bikeParkingSlots += 1;
        return ticket;
    }

}

