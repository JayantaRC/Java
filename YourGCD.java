
package com.mycompany.theforloop;


public class YourGCD {
    
    public static int getGreatestCommonDivisor (int first, int second){
        
        if (first < 10 || second < 10){
            return -1;
        }
        
        int min = first < second ? first : second;
        
        for (int j = min; j >= 1; j--){
            if (first % j == 0 && second % j == 0){
                return j;
            }
        }
        return 1;
    }
    
    public static void main (String [] args){
        
        int first = 10;
    int second = 15;

    int gcd = getGreatestCommonDivisor(first, second);

if (gcd == -1){
    System.out.println("Invalid Input");
} else {
    System.out.println(gcd + " is the GCD of " + first + " and " + second);

    if (gcd == 1){
        System.out.println("They are Coprime Numbers");
    } else {
        System.out.println("They are Not Coprime");
    }
}
        
    }   
}
