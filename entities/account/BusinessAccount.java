/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entities.account;

/**
 *
 * @author GCM_02
 */
public class BusinessAccount extends account {

    private Double loanLimit;
    
    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Double loanLimit, Integer number, String hold, Double balance) {
        super(number, hold, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
   public void loan(double amount){
      if(amount <= loanLimit){
       balance += amount - 10.0;
      }
   }
      @Override
    public void withdraw(double amount){
       super.withdraw(amount);
       balance -= 2.0;
    }
     
          
      
   
}
