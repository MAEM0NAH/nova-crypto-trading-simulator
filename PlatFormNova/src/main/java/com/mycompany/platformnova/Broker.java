
package com.mycompany.platformnova;


public class Broker extends Wallet{
 private Wallet wallet;  
    
    public Broker(Wallet wallet) {
        this.wallet = wallet;
    }


    public void checkBalance() {
        System.out.println("Your current wallet balance is: " + wallet.getBalanceWallet() + " USD");
    }

  
}
