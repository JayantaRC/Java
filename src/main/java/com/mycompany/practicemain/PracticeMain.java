
package com.mycompany.practicemain;

public class PracticeMain {
    
    public static void main (String [] args){
        
        PracticeRecord name1 = new PracticeRecord ("Vijay",21);
        
        PracticeRecord name3 = new PracticeRecord ("Rahul", 25);
        
        System.out.println(name1.name());
        System.out.println(name1.age());
       
        System.out.println(name3.name());
        System.out.println(name3.age());
        
        System.out.println(name1);
        
        PracticeRecord a = new PracticeRecord("Vijay",21);
        PracticeRecord b = new PracticeRecord("Vijay",22);

        System.out.println(a.equals(b));
    }
    
}
