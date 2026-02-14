
package com.mycompany.theforloop;


public class TestingTwo {
    
    public static boolean hasSameLastDigit (int num1, int num2, int num3){

  if (!isValid(num1) || !isValid(num2) || !isValid (num3)){

 return false;
}
  
   int num1First = num1 % 10;
   int num2Second = num2 % 10;
   int num3Third = num3 % 10;

  return num1First == num2Second ||
         num1First == num3Third ||
         num2Second == num3Third;

}

 public static boolean isValid (int number){

  return number >= 10 && number <= 1000;
}



 public static void main (String [] args){

  System.out.println(hasSameLastDigit(11, 41, 61));
  System.out.println(hasSameLastDigit(11, 53, 61));
  System.out.println(hasSameLastDigit(11, 42, 66));

}
    
}
