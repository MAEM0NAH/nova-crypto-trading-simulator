

package com.mycompany.platformnova;

import java.util.Scanner;


public class PlatFormNova {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("You will start Trading if you pressed (START):");
        String Index = in.next();
        if (Index.equalsIgnoreCase("start")) {
            System.out.println("You won't regret choosing our trading platform -->");
        } else {
            System.out.println("We will be happy to have you back.");
        }

        // Collect user information for trading
        System.out.println("Enter your: \n 1. First Name \n 2. Last Name \n 3. Age");
        Nova N = new Nova(in.next(), in.next(), in.nextInt());

        if (N.getAge() < 18) {
            System.out.println("You cannot trade. The age must be over 18."); // Age must be over 18
        } else {
            operation(); // Proceed to the operation
        }
    }

    /**
     * Handles user operations such as wallet initialization and trading.
     */
    public static void operation() {
        System.out.println("Enter your: \n 1. Phone Number \n 2. Email \n 3. Password");
        Nova N2 = new Nova(in.nextInt(), in.next(), in.next());

        System.out.println("Enter your Balance:");
        Wallet W = new Wallet();
        W.setBalanceWallet(in.nextDouble()); // Set the wallet balance

        Broker b = new Broker(W);
        b.checkBalance(); // Display the wallet balance

        // Display available cryptocurrencies and their prices
        Nova N3 = new Nova();
        int[] currencies = N3.getCreptoCurrency();
        double[] prices = N3.getPriceCreptoCurrency();
        System.out.println("Available cryptocurrencies with their prices:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println(currencies[i] + " -> " + prices[i]);
        }

        System.out.println("If you want to buy enter (buy), if you want to sell enter (sell):");
        N3.setAction(in.next()); // Choose action (buy/sell)
        if (N3.getAction().equalsIgnoreCase("buy")) {
            System.out.println("Select the cryptocurrency type you want to buy:");
            System.out.println("1. EUR \n2. BTC \n3. DOGE \n4. PEPE");
            int coinType = in.nextInt();

            System.out.println("Enter the amount of cryptocurrency you want to buy:");
            double amount = in.nextDouble(); // Amount to buy

            CreptoCurrency CS = new CreptoCurrency();
            double totalCost = CS.calculateTotalCost(coinType, amount);

            if (W.getBalanceWallet() >= totalCost) {
                W.ManagementBalance(totalCost); // Deduct the total cost from wallet
                System.out.println("You successfully purchased " + amount + " of cryptocurrency. Your new balance is: " + W.getBalanceWallet() + " USD.");
            } else {
                System.out.println("Insufficient balance! You cannot purchase this cryptocurrency.");
            }
        } else if (N3.getAction().equalsIgnoreCase("sell")) {
            System.out.println("Select the cryptocurrency type you want to sell:");
            System.out.println("1. EUR \n2. BTC \n3. DOGE \n4. PEPE");
            int index = in.nextInt();

            System.out.println("Enter the amount of cryptocurrency you want to sell:");
            double amount = in.nextDouble(); // Amount to sell

            CreptoCurrency CS = new CreptoCurrency();
            double totalSellValue = CS.calculateTotalSell(index, amount);

            W.setBalanceWallet(W.getBalanceWallet() + totalSellValue); // Add the revenue to the wallet
            System.out.println("You successfully sold " + amount + " of cryptocurrency. Your new balance is: " + W.getBalanceWallet() + " USD.");
        } else {
            System.out.println("Invalid action entered. Thanks for your time."); // Invalid action
        }
    }
}

