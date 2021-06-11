package com.testVagrant.setup;

import java.util.Scanner;

// this class takes the command line input ...
// returns string
public class Input {

    public static String giveInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

}
