
package com.mycompany.entities.account;


public class SavingsAccounts extends account {
     
    private Double interestRate;
    
    public SavingsAccounts(){
        super();
    } 

    public SavingsAccounts(Double interestRate, Integer number, String hold, Double balance) {
        super(number, hold, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    public void updateBalance(){
        balance += balance * interestRate;
    } 
    @Override
    public void withdraw(double amount){
        balance -= amount;
    }
    
    
}
