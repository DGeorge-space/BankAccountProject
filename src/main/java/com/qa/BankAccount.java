
package com.qa;

import java.time.LocalDate; // import the LocalDate class

public class BankAccount {

    BankAccount(){
        this.setBalance(0.00);
        this.setMinimumBalance(0.00);
        this.setAccountHolderName("unknown");
        this.setOpenDate();
    };

    BankAccount(double minimumBalance, String accountHolderName){
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    BankAccount(double balance, double minimumBalance, String accountHolderName){
        this(minimumBalance, accountHolderName);
        this.balance = balance;
    };



    private double balance;
    private double minimumBalance;
    private String accountHolderName;

    private  LocalDate openDate;

    //private  Calendar openDate;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate() {
        this.openDate = LocalDate.now();
    }
    //Deposit
    public void depositCash(double amount){

        setBalance(getBalance() + amount);
    }


    //Withdraw
    public void withdrawCash(double amount){

        if(amount > getBalance() ){
            setBalance(getBalance());
        }else {
            setBalance(getBalance() - amount);
        }
    }

}
