package com.testVagrant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        TollGate groundFloor=new TollGate();  // initialize the toll gate 

        System.out.println("********** Welcome to Tesseract Parking Slots **********"+"\n"+
               "       Price is higher "+new String(Character.toChars(0X1F601))+", "+"Safety is our priority "+
               new String(Character.toChars(0X1F60A))+"\n");
        do{
            System.out.println("Options: "+"\n"+"1. Enter"+"\n"+"2. Exit"+"\n"+"3. Total Amount Collected for the Day"+"\n"+
                    "4. End the Program"+"\n");
            System.out.println("Please Enter your Choice: ");
            int choice=Integer.parseInt(input.nextLine());
            if(choice>=4)
                break;
            if(choice==1)
                groundFloor.entry();
            else if(choice==2)
                groundFloor.exit();
            else if(choice==3) {
                System.out.println("Total Amount Collected for the Day: " + "Rs "+Math.round(AmountCollection.getTotalAmountCollected()));
                System.out.println("Don't worry Manager Many more to come... "+new String(Character.toChars(0X1F60F))+"\n");
            }
        }while(true);
    }
}
