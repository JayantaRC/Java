package com.mycompany.theforloop;

public class LoopWhile {

    public static void main (String [] args){
        
        int number = 0;
        while (number < 50){
            number +=5;
            if (number % 20 == 0){
                continue;   //if Number is divisible by 20 skip and continue
            }
            System.out.print(number + "_");
            }
        }
    }


