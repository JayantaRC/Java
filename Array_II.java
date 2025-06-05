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

        double avg = sum / number.length;  // Calculate the average (sum divided by 5)

        System.out.println("Total : " + sum);

        System.out.println("Average : " + avg);

        // Assume the first number in the array is the maximum and minimum initially
        double max = number[0];  // Starting max value
        double min = number[0];  // Starting min value

        // Loop through the rest of the array (from index 1 to 4)
        for (int i = 1; i < 5; i++) {

            // If current number is greater than current max, update max
            if (max < number[i]) {
                max = number[i]; // Store the new maximum value
            }
            // If current number is less than current min, update min
            if (min > number[i]) {
                min = number[i]; // Store the new minimum value
            }
        }
        // After the loop ends, print the maximum and minimum values found
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
    }

}
