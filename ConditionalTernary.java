
package com.mycompany.javatutorial;

import java.util.Scanner;
public class ConditionalTernary {
    
    public static void main (String[]args){
        
        Scanner input = new Scanner (System.in);
        int x, y;
          // Prompt user to enter the first number
        System.out.print("Enter First digit : ");
        x = input.nextInt();
        
          // Prompt user to enter the second number
        System.out.print("Enter Second digit : ");
        y = input.nextInt();
        
        // Check if both numbers are equal
        if (x==y){
            System.out.println("Both numbers are equal.");
        }
        else{
             // Use ternary operator to find the larger number between x and y
            int greaterValue = (x>y) ? x : y;
            System.out.println("Large Number : "+greaterValue);   // Print the larger number
        }
        
    }
    
}
