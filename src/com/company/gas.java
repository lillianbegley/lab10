package com.company;

import java.util.Scanner;
import java.lang.Math;

public class gas {

    public void gasLow() {


        Scanner input = new Scanner(System.in);

        System.out.println("Before we start driving, let's check the gas tank. Press 1 to check how many gallons you have left: ");
        int response1 = input.nextInt();
        if (response1 == 1) {
            System.out.println("You're running low on gas: type '1' to fuel up");
        }


        int response = input.nextInt();
        if (response == 1) {
            System.out.println("Ok, let's go to the gas station");
//        } else if (response == 2) {
//            System.out.println("No worries, we have a few miles left before we run out of gas");

        }
    }

    public void gasPrice(String array[][]) {

        for (String[] array1: array) {
            System.out.print("[");
            for (String n: array1) {
                System.out.print(n + " "); // printing each item
            }
            System.out.print("]"); // printing new line
            System.out.println("\n");
        }

    }

    public void math(){
        Scanner input = new Scanner(System.in);
        System.out.println("");

        String value = input.nextLine();

        System.out.println("");

    }
}











