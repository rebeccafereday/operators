package com.rebeccaFereday;

public class Main {

    public static void main(String[] args) {
	    boolean isAlien = false;

	    if(isAlien) {
            System.out.println("is alien");
        }
        else
            System.out.println("is not alien");

	    double myDouble = 20;
	    double myDouble2 = 80;
	    double myDouble3 = (myDouble + myDouble2)*25;
        System.out.println(myDouble3);
        double remainder = myDouble3%40;
        System.out.println(remainder);
        if (remainder <= 20)
            System.out.println("Total was over the limit");

        System.out.println("Complete");

    }
}
