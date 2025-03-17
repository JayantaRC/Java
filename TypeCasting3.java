
package com.mycompany.javatutorial;

import java.util.Scanner;

public class TypeCasting3 {
    
    public static void main (String[]args){
     
        int i;
        float f;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Enter any Number : ");
        i = input.nextInt();
        
        System.out.print("Enter any Number/Float Value : ");
        f = input.nextFloat();
         
        
        double d = i+f;
        System.out.println("Total : "+d);
    }
    
}
