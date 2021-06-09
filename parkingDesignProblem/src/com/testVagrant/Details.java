package com.testVagrant;

import java.util.Scanner;

public class Details {

    private String[] detailToBeNoted=new String[4];
    private String[] inputs={"Car Registration Number",
                            "Time of Entry",
                             "Vehicle Type",
                              "Purpose of Visit"};
    Scanner input=new Scanner(System.in);

    public String[] returnDetails(){
        for(int i=0;i<4;i++){
            System.out.println("Enter the "+this.inputs[i]);
            this.detailToBeNoted[i]=input.nextLine();
        }
        return detailToBeNoted;
    }

}
