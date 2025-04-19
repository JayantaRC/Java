
package com.mycompany.javatutorial;

import java.util.Scanner;


public class Switch2 {
    
    public static void main (String[]args){
        
        Scanner input = new Scanner (System.in);
        double number, number2; // Declare variables to store two numbers
        
        // Prompt the user to enter the first number
        System.out.print("Enter first digit : ");
        number = input.nextDouble();
        
        // Prompt the user to enter the second number
        System.out.print("Enter second digit : ");
        number2 = input.nextDouble();
        
          // Prompt the user to enter an operator to calculate
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0); 
        
         // Use a switch statement to perform the appropriate operation
        
         switch (operator){
            
            case '+':  // Addition
                System.out.printf("Result : %.2f\n", (number+number2));
                break;
                
                case '-':  // Subtraction
                System.out.printf("Result : %.2f\n", (number-number2));
                break;
                
                case '*': // Multiplication
                System.out.printf("Result : %.2f\n", (number*number2));
                break;
                
                case '/':   // Division with zero-check
                    
                    if (number2 != 0){
                       System.out.printf("Result : %.2f\n", (number/number2));
                    }
                    else {
                         System.out.println("Cannot divide by zero!");  // Handle division by zero
                    }
                break;
                    
                default:
                     // Handle invalid operator input
                    System.out.println("Enter Valid Operator");
        }
        input.close(); // Close the Scanner to free up resources
        
    }
}
