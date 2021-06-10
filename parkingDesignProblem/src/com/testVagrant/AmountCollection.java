package com.testVagrant;

import java.util.HashMap;

public class AmountCollection {

    private double totalAmountCollected;
    private float percentageOfDiscount;
    private Vehicle vehicle;
    private long exitTime;
    private int timeToConsider=5;  // time to simulate for 1hr
    private static double getTotalAmountCollected;

    HashMap<String,Integer> priceCard=new HashMap<String,Integer>();

    // we can add total amount by individuals also -> using hashmaps

    public AmountCollection(float discountPrice){
        this.totalAmountCollected=0;
        this.percentageOfDiscount=discountPrice;
        this.setPriceCard();
    }

    public void setPriceCard() {
        this.priceCard.put("car",40);
        this.priceCard.put("bike",20);
    }

    // method overriding
    public void setPriceCard(String vehicleType,int pricePerHour){ // this is useful to set the price in dynamic mode
        this.priceCard.put(vehicleType,pricePerHour);
    }

    public Integer getPriceCard(String vehicleType) {
        return priceCard.get(vehicleType);
    }

    public static double getTotalAmountCollected(){
        return getTotalAmountCollected;
    }



    public void setTheVehicle(Vehicle vehicle, long exitTime){
        this.vehicle=vehicle;
        this.exitTime = exitTime;
    }

    public double calculateAmount(){
        String purposeOfVisit=this.vehicle.getPurposeOfVisit();
        int pricePerHour=this.getPriceCard(this.vehicle.getVehicleType());
        int durationInSeconds=(int)(((this.exitTime-this.vehicle.getTimeOfEntry())/1000)%60); // total time vehicle is parked
        double priceCalculated=this.calculator(pricePerHour,durationInSeconds);
        if(purposeOfVisit.equals("movie"))
            priceCalculated=priceCalculated-(priceCalculated*this.percentageOfDiscount);
        this.totalAmountCollected=this.totalAmountCollected+priceCalculated;
        getTotalAmountCollected=this.totalAmountCollected;
        return priceCalculated;
    }

    private double calculator(int pricePerHour,int durationInSeconds){
        int numberOfHours=(int)(durationInSeconds/this.timeToConsider);
        double priceCalculated=numberOfHours*(pricePerHour);
        return priceCalculated;
    }

}





