package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println( "Press C to convert from Fahrenheit to Celsius\nPress F to convert from Celsius to Fahrenheit.");
        String startingType = input.next();

        int f =0;
        int c =0;

        if (startingType.equalsIgnoreCase("C")) {
            System.out.printf("Your choice: C\nPlease enter the temperature in Fahrenheit ");
            int tempF = input.nextInt();
            c = (tempF - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + c + ".");
        } else if (startingType.equalsIgnoreCase("F")) {
            System.out.printf("Your choice: F\nPlease enter the temperature in Celsius ", startingType);
            int tempC = input.nextInt();
            f = (tempC * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + f + ".");
        }



    }
}
