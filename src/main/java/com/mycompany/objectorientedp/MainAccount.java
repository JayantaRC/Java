
package com.mycompany.objectorientedp;


public class MainAccount {
    
    public static void main(String [] args){
        
        Account bobsAccount = new Account ("1122334455", 1000.00, "Bob Brave",
        "email@bob.com", "32751 45797");
        

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getCustomerEmail());
        System.out.println(bobsAccount.getCustomerPhone());
        
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);
        bobsAccount.withdrawFunds(500);
        
    }
    
}
