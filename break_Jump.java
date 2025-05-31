
package com.mycompany.javatutorial;


public class break_Jump {
    
    public static void main (String[]args){
        
         // First for loop: counts from 1 to 100
        for (int i = 1; i<=100; i++){
            
            // If i becomes 10, break the loop (exit the loop immediately)
            if (i==10){
                break;
            }
             // Print the value of i before it reaches 10
            System.out.println(i); // Output: 1 to 9
        }
        
        // Print a separator line
        System.out.println("---------------");
        
        // Second for loop: prints even numbers starting from 2 up to 100
        for (int j = 2; j<=100; j=j+2){
            
            // If j becomes 10, break the loop
            if (j==10){
                break;
            }
             // Print the value of j before it reaches 10
            System.out.println(j); // Output: 2, 4, 6, 8
        }
    }
    
}
