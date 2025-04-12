
package com.mycompany.javatutorial;

import java.util.Scanner;


public class LogicalOperator3 {
    
    public static void main (String[]args){
        
        //Get Input from the user, if both conditions are correct then it will print the person is eligible.
        
        Scanner input = new Scanner (System.in);
        char English, Masters;
        
        System.out.print("Have you completed Masters? : ");
        Masters = input.next().charAt(0);
        
        System.out.print("Are you fluent in Eglish? : ");
        English = input.next().charAt(0);
        
        if((Masters=='Y' || Masters=='y') && (English=='y' || English=='Y')){
            System.out.println("Congratulations! You are eligible.");
            
        }
        
        else{
            System.out.println("Sorry you are not eligible.");
        }
    }
    
    
}
