
package com.mycompany.objectorientedp;

public class Account {
    
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void depositFunds(double depositAmount) {
        
        balance += depositAmount;
        System.out.println("Deposit Amount of " + depositAmount + " made. New balance is Rs." + 
                this.balance);
    }
    public void withdrawFunds(double withdrawalAmount) {
        
        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Amount! You have only Rs." + balance +
                    " in your account");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal amount of Rs." + withdrawalAmount +
                    " processed, remaining balance = Rs." + balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
    
    
}
