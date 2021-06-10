package com.testVagrant;

import java.util.Scanner;

public class Details {

    private String[] detailToBeNoted=new String[3];
    private String[] inputs={"Car Registration Number",
                              "Vehicle Type",
                              "Purpose of Visit"};
    Scanner input=new Scanner(System.in);

    public String[] returnDetails(){
        for(int i=0;i<3;i++){
            System.out.println("Enter the "+this.inputs[i]);
            this.detailToBeNoted[i]=input.nextLine();
        }
        return detailToBeNoted;
    }

}
