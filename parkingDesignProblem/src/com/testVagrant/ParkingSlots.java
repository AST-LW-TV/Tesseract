package com.testVagrant;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ParkingSlots {

    private static int bikeParkingSlots;
    private static int carParkingSlots;

    private static List<Ticket> parkingArea = new ArrayList<>();  // parking area is public

    public ParkingSlots(int bikeSlots, int carSlots) {
        this.bikeParkingSlots = bikeSlots;
        this.carParkingSlots = carSlots;
    }

    // gets the free slots ...
    public String getTotalFreeSlots() {
        return "Total Free Slots " + ((bikeParkingSlots+carParkingSlots)-parkingArea.size());
    }

    // Checking the availability of parking
    // returns boolean
    public static boolean checkParking(String vehicleType){
        int carCount=0,bikeCount=0;
        boolean isAvailable=false;
        for(int i=0;i<parkingArea.size();i++){
            if(parkingArea.get(i).getVehicleType().equals("car"))
                carCount+=1;
            else if(parkingArea.get(i).getVehicleType().equals("bike"))
                bikeCount+=1;
        }
        if(vehicleType.equals("car") && (carParkingSlots-carCount)>0)
            isAvailable=true;
        if(vehicleType.equals("bike") && (bikeParkingSlots-carCount)>0)
            isAvailable=true;
        return isAvailable;
    }

    // Parking the vehicle
    // vehicle parks in the slot after ticket is issued
    public void parkTheVehicle(Ticket ticket) {
        this.parkingArea.add(ticket);
    }

    // Exiting the vehicle
    // this method is simulated and automatically gets the vehicle and sends it to the exiting toll ...
    // returns ticket
    public static Ticket getTheVehicle() {
        int length = parkingArea.size();
        int randomVehicle = new Random().nextInt(length);
        Ticket ticket = parkingArea.get(randomVehicle);
        parkingArea.remove(randomVehicle);
        return ticket;
    }

}

