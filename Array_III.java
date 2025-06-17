
package com.mycompany.javatutorial;


public class Array_III {
    
    public static void main (String[]args){
        int sum = 0;
        int [] num = {10,20,30,40,50,60,70,80,90,100};
         
        for (int x : num) {
            sum = sum + x;
         
        }
         System.out.println(sum);  
    }
    
}
