
package com.mycompany.javatutorial;

import java.util.Scanner;


public class OfficeProject {
    
    public static void main (String []args){
     
        
        Scanner input = new Scanner (System.in);
            
        double base, height, area;
        
        System.out.print("Type Base of Triangle : ");
        base = input.nextDouble();
        
        System.out.print("Type Height of Triangle : ");
        height = input.nextDouble();
        
        area = 0.5 * base * height;
        
        System.out.print("Total area of Triangle is : "+area);
        
    }      
}