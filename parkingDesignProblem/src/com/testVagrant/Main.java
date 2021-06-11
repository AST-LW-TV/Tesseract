package com.testVagrant;

import com.testVagrant.setup.Input;

public class Main {

    public static void main(String[] args) {

        ParkingSlots parkingSlots = new ParkingSlots( 200, 300); // set the individual slots

        AmountCollection amountCollection = new AmountCollection();

        TollGate groundFloor = new TollGate();  // initialize the toll gate

        System.out.println("********** Welcome to Tesseract Parking Slots **********" + "\n" +
                "       Price is higher " + new String(Character.toChars(0X1F601)) + ", " + "Safety is our priority " +
                new String(Character.toChars(0X1F60A)) + "\n");

        do {
            System.out.println("Options: " + "\n" + "1. Check the Free Slots and Issue ticket if available" + "\n"  +
                    "2. Exit" + "\n" +
                    "3. Total Amount Collected for the Day" + "\n" + "4. End the Program" + "\n");

            System.out.println("Please Enter your Choice: ");
            int choice = Integer.parseInt(Input.giveInput());
            if (choice >= 4)
                break;

            else if (choice == 1) {
                System.out.println("Enter the Vehicle Type: ");
                String vehicleType = Input.giveInput();
                boolean isAvailable=ParkingSlots.checkParking(vehicleType);
                System.out.println("\n" + parkingSlots.getTotalFreeSlots() + "\n");
                if(isAvailable){
                    Ticket ticket=groundFloor.entry(vehicleType);
                    parkingSlots.parkTheVehicle(ticket);  // parking the vehicle ...
                    System.out.println("\n"+"Vehicle is Parked");
                }else{
                    System.out.println("The Parking is FULL, Your Vehicle Missed the Best Place " +
                            new String(Character.toChars(0X1F614)) + "\n");
                }

            }else if (choice == 2) {
                // here the vehicle is automatically existing and gives the ticket to exit ...
                Ticket ticket = ParkingSlots.getTheVehicle(); // movie or shopping is over so he is exiting and gives the ticket
                groundFloor.exit(ticket);
            }

            else if (choice == 3) {
                System.out.println("Total Amount Collected for the Day: " + "Rs " +
                        Math.round(AmountCollection.getTotalAmountCollected()));
                System.out.println("Don't worry Manager Many more to come... " +
                        new String(Character.toChars(0X1F60F)) + "\n");
            }
        } while (true);

    }

}
