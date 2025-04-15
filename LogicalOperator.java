
package com.mycompany.javatutorial;
import java.util.Scanner;

public class ExampleLogical {
    
    public static void main (String[]args){
        
        Scanner input = new Scanner (System.in);
        
        char letter;
        System.out.print("Enter any single character to find Vowel or Consonant : ");
        letter = input.next().charAt(0);
        
        //This Logical Operator progarm is ready to help to find the vowel or consonant with the help of Control Statement.
        
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
            System.out.println("Vowel");
        }
        
        else{
        System.out.println("Consonant");
    }
        
    }
    
}
