package com.testVagrant;

import java.util.HashMap;

public class AmountCollection {

    private double totalAmountCollected;
    private float percentageOfDiscount;
    private Vehicle vehicle;

    HashMap<String,Integer> priceCard=new HashMap<String,Integer>();

    public AmountCollection(float discountPrice){
        this.percentageOfDiscount=discountPrice;
        this.setPriceCard();
    }

    public void setPriceCard() {
        this.priceCard.put("car",40);
        this.priceCard.put("bike",20);
    }

    // polymorphism
    public void setPriceCard(String vehicleType,int pricePerHour){ // this is useful to set the price in dynamic mode
        this.priceCard.put(vehicleType,pricePerHour);
    }

    public Integer getPriceCard(String vehicleType) {
        return priceCard.get(vehicleType);
    }

    public double getTotalAmountCollected(){
        return this.totalAmountCollected;
    }

    public void setTheVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }

    public void calculateAmount(){
        String purposeOfVisit=this.vehicle.getPurposeOfVisit();
        if(purposeOfVisit.equals("movie")){
            int pricePerHour=this.getPriceCard(this.vehicle.getVehicleType());
            // time to calculate
            // simulation of 15s to 1hr
            }
        }
}


