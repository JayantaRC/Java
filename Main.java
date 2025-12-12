
package com.mycompany.basicjava;


public class Main {
    public static void main (String [] args){
        
        double firstNumber = 20.00d;
    double secondNumber = 80.00d; // From "double to semicolon ;" is a statemnt and "firstNumber = 20.00d" is expression
    
    
    double Total = (firstNumber + secondNumber) * 100.00d;
        System.out.println(Total);
        
        // Printing 8020.0 instaed of 10000.0 which is incorrect but to resolve this issue we will use () Precedence which is high Precedence
        
    }
    
}

