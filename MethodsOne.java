
package com.mycompany.basicjava;


public class MethodsOne {
               
   public static void leapYear (int year){
       
       if (year < 1 || year > 9999){
           System.out.println("Invalid Year");
           return;
       }
       
       if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
           
           System.out.println( year + " is a leap year, which means "
           + year +" February has one extra day, making a total of 29 days.");
           
       }
       else{
           System.out.println(year + " is not a leap Year");
       }
       
   }
   
           public static void main (String [] args) {
               
               leapYear (2016);
           }
}
