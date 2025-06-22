package com.mycompany.javatutorial;

import java.util.Scanner;

public class Array_III {

    public static void main(String[] args) {

        /* 
        Scanner         Reads user input from keyboard
        String[] week   Stores names of the 7 days
        */
        Scanner input = new Scanner(System.in);
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        /*
        System.out.print()     Asks user to enter a number
        input.nextInt()        Takes number input from user
        */
        System.out.print("Enter a number from 1 to 7: ");
        int userInput = input.nextInt();

        /*
        if (1 to 7)                 Checks if input is valid
        week[userInput - 1]        Finds the correct day (since array index starts from 0)
        System.out.println()       Prints the matching day
        else                       Prints error if number is not between 1 and 7
        */
        if (userInput >= 1 && userInput <= 7) {
            System.out.println("Day " + userInput + ": " + week[userInput - 1]);
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        /*
        input.close()     Closes the scanner to avoid memory leaks
        */
        input.close();
    }
}
