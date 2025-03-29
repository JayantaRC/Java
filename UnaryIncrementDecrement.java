
package com.mycompany.javatutorial;


public class UnaryIncrementDecrement {
    
    public static void main (String []args){
        
        int x = 10;
        int y;
        int z;
        
        // Postfix Increment
        y = x++; // output 10
        System.out.println("Y : "+y);
        
        y = x; //output 11
        System.out.println("Y : "+y);
        
        
        // Prefix Increment
        y = ++x; // output 12
        System.out.println("Y : "+y);
        
        y = x; //output 12
        System.out.println("Y : "+y);
        
        
        
        // Postfix Decrement
        y = x--; // output 12
        System.out.println("Y : "+y);
        
        y = x; //output 11
        System.out.println("Y : "+y);
        
        z = -49;
        
        
        // Prefix Decrement for the value of 49
        y = --z; // output 50
        System.out.println("Y : "+z);
        
        y = z; //output 48
        System.out.println("Y : "+z);
        
    }
    
}
