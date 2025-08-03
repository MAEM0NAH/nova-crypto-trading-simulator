
package com.mycompany.platformnova;


public class Wallet  {
    
    private double BalanceWallet;
   
    public Wallet() {    
     BalanceWallet=0.0;
    }

    public double getBalanceWallet() {
        return BalanceWallet;
    }

    public void setBalanceWallet(double BalanceWallet) {
        this.BalanceWallet = BalanceWallet;
    }
/**
     * Manages balance by subtracting the specified amount if sufficient balance exists.
     * @param amount The amount to deduct
     */
  
 public void ManagementBalance(double amount) {
        if (BalanceWallet >= amount) {
            BalanceWallet -= amount;// Deduct the specified amount
        } else {
            System.out.println("the balance is not enough .");
        }
 }
   
    
}
