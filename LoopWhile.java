
package com.mycompany.javatutorial;


public class LoopWhile {
    
    public static void main (String[]args){
        
        // Loop 1: Print numbers from 10 to 1 with "India"
        int i = 10;
        
        while (i>=1){
            
            System.out.println(i+" India"); // Prints current number with "India"
            
            i--; // Decrease i by 1
        }
        
        // Loop 2: Print numbers from 1 to 10 with "Bharat"
        int a = 1;
        
        while (a<=10){
            
            System.out.println(a+" Bharat"); // Prints current number with "Bharat"
            
            a++; // Increase a by 1
    }
        
        // Loop 3: Print even numbers from 2 to 10 with "Hindustan"
        int b = 2;
        
        while (b<=10){
            
            System.out.println(b+" Hindustan"); // Prints even number with "Hindustan"
            
            b=b+2; // Increase b by 2 to get the next even number
        }
    } 
}
