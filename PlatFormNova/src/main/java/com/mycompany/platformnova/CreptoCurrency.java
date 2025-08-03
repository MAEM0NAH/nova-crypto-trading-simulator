
package com.mycompany.platformnova;


import java.util.Scanner;

public class CreptoCurrency {
    // 1.EUR=1.0390  2.BTC=1.0390  3.DOGE=0.38748 4.PEPE=0.000000001813
    private int EUR, BTC, DOGE, PEPE;       
    private double[] prices = {1.0390, 101.963, 0.38748, 0.000000001813}; // أسعار العملات

    public CreptoCurrency() {
    }


    public int getEUR() { 
        return EUR; }
    
    public void setEUR(int EUR) { 
        this.EUR = EUR; }

    public int getBTC() { 
        return BTC; }
    
    public void setBTC(int BTC) {
        this.BTC = BTC; }

    public int getDOGE() { 
        return DOGE; }
    
    public void setDOGE(int DOGE) {  
        this.DOGE = DOGE; }

    public int getPEPE() { 
        return PEPE; }
    
    public void setPEPE(int PEPE) {
        this.PEPE = PEPE; }

   /**
     * Calculates the total cost of buying cryptocurrency.
     * @param coinType The type of cryptocurrency (1: EUR, 2: BTC, etc.)
     * @param amount The amount to buy
     * @return The total cost in USD
     */
    public double calculateTotalCost(int coinType, double amount) {// Calculate cost based on price and amount 
        return prices[coinType - 1] * amount;                       
    }
    
     /**
     * Calculates the total revenue from selling cryptocurrency.
     * @param coinType The type of cryptocurrency (1: EUR, 2: BTC, etc.)
     * @param amount The amount to sell
     * @return The total revenue in USD
     */
    public double calculateTotalSell(int coinType, double amount) {// Calculate revenue from selling
    return prices[coinType - 1] * amount;
}
}



    



  

