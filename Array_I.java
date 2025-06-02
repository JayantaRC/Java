
package com.mycompany.javatutorial;


public class Array_I {
    
    public static void main (String[]args){
        
        // Declare and create an integer array of size 5
        int [] number = new int [5];
        
        // Assign values to each element in the array
        number [0]= 5;
        number [1]= 10;
        number [2]= 15;
        number [3]= 20;
        number [4]= 25;
        
         // Get the length of the array using .length property
        int len = number.length;
        
        // Manually calculate the sum of all array elements
        int sum = number [0] +number [1] + number [2] + number [3] + number [4];
        
        // Print the total sum and length using formatted output
        System.out.printf("Total Addition : %d\nTotal Length : %d\n" ,sum,len);
        
    }
    
}
