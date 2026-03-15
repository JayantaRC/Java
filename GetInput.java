
package com.mycompany.theforloop;
import java.util.Scanner;
public class GetInput {
    
    public static void main (String [] args) {
        
        int currentYear = 2027;
            
        System.out.println(getInputFromScanner(currentYear));
    }
     
    public static String getInputFromScanner (int currentYear){
        
        Scanner input = new Scanner (System.in);
        System.out.println("Hi, what is your name?");
        String name = input.nextLine();
        System.out.println("Hello, "+ name + " thank you for stay connected with us.");
        
        System.out.println("What year were you born?");
        
        boolean validDOB = false;
        int age = 0;
        
        do {
            System.out.println("Enter a year of birth > "+ 
                    (currentYear - 125) + " and < " + currentYear);
       try { 
        age = checkData(currentYear, input.nextLine());
        validDOB = age < 0 ? false : true;
       } catch (NumberFormatException badUserData){
           System.out.println("Characters are not allowed! Try again.");
       }
        } while (!validDOB);
        return name + " as I can check, you are " + age + " years old.";
        
    }
    
    public static int checkData (int currentYear, String dateOfBirth){
        
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        
        if (dob < minimumYear || dob > currentYear){
            return -1;
        }
        
        return (currentYear - dob);
    }
    
}
