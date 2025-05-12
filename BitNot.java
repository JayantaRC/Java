
package com.mycompany.javatutorial;

import java.util.Scanner;


public class BitNot {
    
    public static void main (String[]args){
        
        Scanner input = new Scanner (System.in);
        int number;
        
        System.out.print("Enter any digit : ");
        number = input.nextInt();
        
        int kot = ~number;
        System.out.println("Bitwise NOT (~" + number + ") = " + kot);
        
    }
    
}
