/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entities.account;

/**
 *
 * @author GCM_02
 */
public class account {
  
     private Integer number;
     private String hold;
     protected Double balance;
     
     
     public account(){
            
     }

    public account(Integer number, String hold, Double balance) {
        this.number = number;
        this.hold = hold;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHold() {
        return hold;
    }

    public void setHold(String hold) {
        this.hold = hold;
    }

    public Double getBalance() {
        return balance;
    }

   
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }
    public void deposit(double amount){
        balance += amount;
    }
    
} 
