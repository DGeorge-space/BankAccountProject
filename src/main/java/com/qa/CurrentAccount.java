package com.qa;

public class CurrentAccount extends BankAccount{
    /**
     *
     Current Account


     A CurrentAccount should have a maximum withdrawal amount

     */
    private double maxWithdrawalAmount;

    CurrentAccount(){
        super();
    }

    public double getWithdrawalAmount(){
        return  this.maxWithdrawalAmount;
    }

    public void setWithdrawalAmount(double maxWithdrawalAmount){
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    @Override
    public void withdrawCash(double amount){

        if(amount <= maxWithdrawalAmount){
            super.withdrawCash(amount);
        }
        else {
            super.withdrawCash(0);
        }
    }
}
