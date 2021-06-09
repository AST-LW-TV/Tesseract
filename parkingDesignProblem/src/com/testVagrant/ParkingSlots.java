package com.testVagrant;

import java.util.List;
import java.util.ArrayList;

public class ParkingSlots {

    private int totalNumberOfSlots;
    private int bikeParkingSlots;
    private int carParkingSlots;

    List<Vehicle> parkingArea=new ArrayList<Vehicle>();  // parking area is public

    public ParkingSlots(){
        this.totalNumberOfSlots=500;
        this.bikeParkingSlots=200;
        this.carParkingSlots=300;
    }

    public ParkingSlots(int totalSlots,int bikeSlots,int carSlots){
        this.totalNumberOfSlots=totalSlots;
        this.bikeParkingSlots=bikeSlots;
        this.carParkingSlots=carSlots;
    }

    public String getTotalFreeSlots(){
        return "Total Free Slots "+this.totalNumberOfSlots+" Among then Cars have "
                +this.carParkingSlots+" and Bikes have "+this.bikeParkingSlots;
    }

    public int[] getFreeVehicleSlots(){
        int[] temp={this.carParkingSlots,this.bikeParkingSlots};
        return temp;
    }

    public void setTotalNumberOfSlots(int bikeSlots,int carSlots){
        this.totalNumberOfSlots=bikeSlots+carSlots;
    }

    public int getTotalCarSlots(){
        return this.carParkingSlots;
    }

    public boolean setParking(String vehicleType){
        if(this.totalNumberOfSlots>0){
            this.totalNumberOfSlots-=1;
            if(vehicleType.equals("car"))
                this.carParkingSlots-=1;
            else if(vehicleType.equals("bike"))
                this.bikeParkingSlots-=1;
            return true;
        }else{
            return false;
        }
    }

    public void parkTheVehicle(Vehicle vehicle){
        this.parkingArea.add(vehicle);
    }

    public Vehicle searchTheVehicle(String vehicleRegistrationNumber){
        for(int i=0;i<this.parkingArea.size();i++){
            if(this.parkingArea.get(i).getVehicleRegistrationNumber().equals(vehicleRegistrationNumber));
                return this.parkingArea.get(i);
            }
        return null;
        }

}

