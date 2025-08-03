
package com.mycompany.platformnova;


import java.util.Scanner;


public class Nova {
    static Scanner in=new Scanner(System.in);
    private String FarstName , LastName;
    private int Age , PhoneNamber;
    private String Email,Password;
    private int[]CreptoCurrency={1,2,3,4};
    private double[]PriceCreptoCurrency={1.0390,101.963,0.38748,0.000000001813};//بالدولار(USD)
    private String Action;// Sell,Buy
   private Wallet BalanceWallet;// aggregation 
    
    public Nova() { //ليست مهمه هنا لان المستخدم سوق سثوم بتزويد المعلومات
        this.FarstName = "DefaultFirstName";
        this.LastName = "DefaultLastName";
        this.Age = 18; 
        this.PhoneNamber = 0000000000;
        this.Email = "default@gmail.com";
        this.Password = "0000";
    }

    public Nova(String FarstName, String LastName, int Age) {
        this.FarstName = FarstName;
        this.LastName = LastName;
        this.Age = Age;
    }

    public Nova(int PhoneNamber, String Email, String Password) {
        this.PhoneNamber = PhoneNamber;
        this.Email = Email;
        this.Password = Password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        
        this.Age = Age;
    }

    
    public String getAction() {
        return Action;
    }

    public void setAction(String Action) {
        this.Action = Action;
    }

  
    public int[] getCreptoCurrency() {
        return CreptoCurrency;
    }

    public void setCreptoCurrency(int[] CreptoCurrency) {
        this.CreptoCurrency = CreptoCurrency;
    }

    public double[] getPriceCreptoCurrency() {
        return PriceCreptoCurrency;
    }

    public void setPriceCreptoCurrency(double[] PriceCreptoCurrency) {
        this.PriceCreptoCurrency = PriceCreptoCurrency;
    }


 
}
