
package com.mycompany.javatutorial;


public class MathDemo {
    
    public static void main (String[]args){
        
        int x = 20;
        int y = 10;
        
        double d = 20;
        double e = 40.00d;
        
        int max = Math.max(x, y);
        System.out.println("Maximum :" +max);
        int min = Math.min(x, y);
        System.out.println("Minimum :" +min);
        
        double cos = Math.cosh(d);
        System.out.println("Cos :" +cos);
        
        double pow = Math.pow(e, d);
        System.out.println("Power :" +pow);
        
        double r = Math.sqrt(e);
        System.out.println("square root :" +r);
        
    }

    
    
}
