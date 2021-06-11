package com.testVagrant;

import java.util.HashMap;

public class AmountCollection {

    private static double totalAmountCollected;

    // simulating the time -> 5s is 1hr for this prototype purposes or it can be changed ...
    private static int timeToConsider = 5;

    private static HashMap<String, double[]> priceCard = new HashMap<>();

    public AmountCollection() {
        this.totalAmountCollected = 0;
        this.setPriceCard();
    }

    // dictionary that stores the vehicle type with its price per hour and discount on movie ...
    // can add other details in future ...
    private void setPriceCard() {
        priceCard.put("car", new double[]{40, 0.1});
        priceCard.put("bike", new double[]{20, 0.1});
    }

    // calculates how much price to be paid ...
    // returns price calculated
    public static double calculateAmount(Ticket ticket, long exitTime, String purposeOfVisit) {
        double priceCalculated;
        int numberOfHours;
        double[] priceDetails = priceCard.get(ticket.getVehicleType());
        int durationInSeconds = (int) (((exitTime - ticket.getEntryTime()) / 1000) % 60);
        numberOfHours = (int) (durationInSeconds / timeToConsider);
        priceCalculated = numberOfHours * (priceDetails[0]);
        priceCalculated = purposeOfVisit.equals("movie") ? priceCalculated - (priceCalculated * priceDetails[1]) : priceCalculated;
        totalAmountCollected += priceCalculated;
        return priceCalculated;
    }

    // gets total amount of time anytime
    // returns total amount collected
    public static double getTotalAmountCollected() {
        return totalAmountCollected;
    }

}





