
package com.mycompany.javatutorial;

import java.util.Scanner;
public class AsciiSwitch {
    
    public static void main (String[]args){
        //Better to use Switch selection instead of if else.
        Scanner input = new Scanner (System.in);
        int digit;
        System.out.print("Enter any single digit : ");
        digit = input.nextInt();
        
        char ascii = (char) digit;  // Cast the digit to char outside the switch
        
        switch (digit){   // Switch statement to handle the cases
            case 33:
                System.out.println("Thirty Three");
                 // Display the ASCII value
                System.out.print("American Standard Code for Information Interchange : " +ascii);
                  break;
              case 34:
                System.out.println("Thirty Four");
                 // Display the ASCII value
                System.out.print("American Standard Code for Information Interchange : " +ascii);
                  break;
              case 35:
                System.out.println("Thirty Five");
                 // Display the ASCII value
                System.out.print("American Standard Code for Information Interchange : " +ascii);
                  break;
              case 36:
                System.out.println("Thirty Six");
                 // Display the ASCII value
                System.out.print("American Standard Code for Information Interchange : " +ascii);
                  break;
              case 37:
                System.out.println("Thirty Seven");
                 // Display the ASCII value
                System.out.print("American Standard Code for Information Interchange : " +ascii);
                  break;
              case 38:
                System.out.println("Thirty Eight");
                 // Display the ASCII value
                System.out.print("American Standard Code for Information Interchange : " +ascii);
                  break;
              case 39:
                System.out.println("Thirty Nine");
                 // Display the ASCII value
                System.out.print("American Standard Code for Information Interchange : " +ascii);
                  break;
              case 40:
                System.out.println("Forty");
                 // Display the ASCII value
                System.out.print("American Standard Code for Information Interchange : " +ascii);
                  break;
              case 41:
                System.out.println("Forty One");
                 // Display the ASCII value
                System.out.print("American Standard Code for Information Interchange : " +ascii);
                  break;
              case 42:
                System.out.println("Forty Two");
                 // Display the ASCII value
                System.out.print("American Standard Code for Information Interchange : " +ascii);
                  break;
                
        default:
                    
           System.out.print("Enter The Number Between 33 to 42");
        }        
        }
        
    }
