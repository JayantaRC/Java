
package com.mycompany.javatutorial;

import java.util.Scanner;


public class LogicalOperator2 {
    
    public static void main (String[]args){
        
        Scanner input = new Scanner (System.in);
        
        char letter;
        
        System.out.print ("Enter any Number : ");
        letter = input.next().charAt(0);
        
        if (letter>='a' && letter<='z'){  // From a to z in small
            System.out.println("---Small Letter---");
        }
        else if (letter>='A' && letter <= 'Z'){ // From A to Z in CAPITAL
            System.out.println("---Capital letter---");
            
        }
        else{
            System.out.println("Invalid");
        }
        // NOTE : If you type any word E.g.India it will take as capital as "India" first letter is showing as capital "I"
    }
}
