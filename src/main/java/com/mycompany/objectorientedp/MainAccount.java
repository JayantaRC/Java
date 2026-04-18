
package com.mycompany.objectorientedp;


public class MainAccount {
    
    public static void main(String [] args){
        
        Account bobsAccount = new Account ();
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);
        
    }
    
}
