package com.testVagrant;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        TollGate groundFloor=new TollGate();
//        int i=0;
//        while(i<5) {
//            groundFloor.entry();
//            i+=1;
//        }
        AmountCollection am=new AmountCollection(0.1f);
        am.setPriceCard();
        System.out.println(am.getPriceCard("Car"));
    }
}
