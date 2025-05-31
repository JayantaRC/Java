
package com.mycompany.javatutorial;


public class continue_Jump {
    
    public static void main (String[]args){
        
        // First loop: from 1 to 100, increasing by 1
        for (int i = 1; i<=100; i++){
            
             // If i equals 10, skip printing and move to next loop iteration
            if (i==10){
                continue; // Skips the value 10
            }
             // Print all numbers from 1 to 100 except 10
            System.out.println(i);
        }
        
        // Print a separator line
        System.out.println("_______________");
        
        // Second loop: from 1 to 100, increasing by 3
        for (int i = 1; i<=100; i=i+3){
            
             // If i equals 10, skip printing and move to next loop iteration
            if (i==10){
                continue; // Skips the value 10 if it occurs
            }
             // Print values like 1, 4, 7, 10 (skipped), 13, 16, ... 100
            System.out.println(i);
        }
    }
    }
    

