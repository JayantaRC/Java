package com.mycompany.theforloop;

public class LoopWhile {

    public static void main (String [] args){
        
        int number = 2;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;
        
        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                oddCount++;
                
                continue;
            }
                System.out.println("Even Number " + number);
                evenCount++;
                if (evenCount >= 5){
                    break;
                }
        }
        
        System.out.println("Even Count is " + evenCount);
        System.out.println("Odd Count is " + oddCount);
    }
      
    public static boolean isEvenNumber (int number){
        
        if (number % 2 == 0){
            return true;
            
        } else {
            return false;
        }
    }
    
    }


