package com.company;

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                int pressButton;

                System.out.println("Press 1 to turn car on or Press 2 to turn car off");
                pressButton = input.nextInt();

                if (pressButton == 1) {
                    System.out.println("Great! Let's go for a drive!");

                    String Destination;
                    System.out.println("Enter the location you wish to go to: ");
                    String destination = input.next();
                    System.out.println("The directions to: " + destination + ", have been set, let's go!");

                    gas option = new gas();
                    gas mal = new gas();

                    option.gasLow();
                    System.out.println("Here are the gas prices at the gas station: ");
                    String[][] prices = {{"1, 2, 3"}, {"$2.99, $3.99, $4.99"}, {"gallon, gallons, gallons"}};
                    mal.gasPrice(prices);

                    speed limit = new speed();
                    limit.speedLimit();







                } else if (pressButton == 2) {
                    System.out.println("That's ok, let's try for another time!");
                } else if (pressButton != 0) {
                    System.out.println("You have quit the game: Hope you can join us next time!");

                }
            }
        }







