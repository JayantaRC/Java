
package com.mycompany.theforloop;


public class DiagonalPattern {
    
    public static void printButterfly (int size){
        
        
        
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= 2 * size; col++){
                
                if (col <= row || col > 2 * size - row){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        for (int row = size; row >= 1; row--){
            for (int col = 1; col <= 2 * size; col ++){
                
                if (col <= row || col > 2 * size - row){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            
            }
        System.out.println();
    }
    }
    public static void main (String [] args){
        
        printButterfly(5);
    }
    
}
