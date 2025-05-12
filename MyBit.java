
package com.mycompany.javatutorial;

import java.util.Scanner;


public class MyBit {
    
    public static void main (String[]args){
         
        int var,var2;
        
        Scanner input = new Scanner (System.in);
        
        
        System.out.print("Enter First Decimal Number : ");
        var = input.nextInt();
        System.out.println("Binary of First: " + Integer.toBinaryString(var));

        
        
        System.out.print("Enter Second Decimal : ");
        var2 = input.nextInt();
        System.out.println("Binary of Second: " + Integer.toBinaryString(var2));

        
        System.out.println("AND : "+ (var & var2));
        System.out.println("OR : "+ (var | var2));
        System.out.println("XOR : "+ (var ^ var2));
    }
    
}
