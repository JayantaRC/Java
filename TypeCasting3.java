
package com.mycompany.javatutorial;

import java.util.Scanner;

public class Arithmetic2 {
    
    public static void main (String[]args){
        
        Scanner input = new Scanner (System.in);
        
        // Get user input for total cost, down payment, interest rate, and EMI months
        System.out.print("Enter Total Cost of the Laptop : ");
        double totalcost = input.nextDouble();
        
        System.out.print("Enter the Down Payment : ");
        double downpayment = input.nextDouble();
        
        double interest = 10;
        System.out.println("Monthly Interest : "+interest);
        
        System.out.print("Enter the Number of Months for EMI : ");
        int months = input.nextInt();
        
        // Calculate the remaining loan amount
        double remainingAmount = totalcost - downpayment;
        
        // Calculate the interest amount
        double interestAmount = remainingAmount * interest / 100;
        
        // Calculate the total loan amount including interest
        double totalAmount = interestAmount + remainingAmount;
        
        // Calculate EMI
        double emi = totalAmount / months;
        
        // Display the results
        System.out.println("\n--- Loan Details ---");
        System.out.printf("Remaining loan amount: %.2f\n", remainingAmount);
        System.out.printf("Interest amount: %.2f\n", interestAmount);
        System.out.printf("Total loan amount (with interest): %.2f\n", totalAmount);
        System.out.printf("Your monthly EMI: %.2f\n", emi);
    }
    
}
