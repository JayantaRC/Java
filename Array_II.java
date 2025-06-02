package com.mycompany.javatutorial;

import java.util.Scanner;

public class Array_II {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

// Create an array named 'number' that can store 5 decimal numbers (doubles)
        double[] number = new double[5];

        double sum = 0;

        System.out.print("Enter five numbers : ");

        // This loop runs 5 times to read 5 numbers from the user
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble(); // Store each number in the array
        }

        // This loop goes through the array and adds each number to 'sum'
        for (int i = 0; i < number.length; i++) {

            sum = sum + number[i];  // Add the current number to the total sum
        }

        System.out.println("Total : " + sum);

        double avg = sum / number.length;  // Calculate the average (sum divided by 5)

        System.out.println("Average : " + avg);

    }

}
