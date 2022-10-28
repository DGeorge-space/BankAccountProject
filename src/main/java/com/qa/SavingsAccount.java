package com.qa;

import java.text.DecimalFormat;
import java.time.LocalDate; // import the LocalDate class


public class SavingsAccount extends BankAccount{
    private static final DecimalFormat dfZero = new DecimalFormat("0.00");
    //Constructors
    SavingsAccount(){
        super();
    }

    SavingsAccount(double interestRate){
        this.interestRate = interestRate;
    };

    //Attributes
    private double interestRate = 0.005;
    private boolean interestApplied = false;


    //Methods
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        LocalDate todayDate = LocalDate.now();
        LocalDate interestAppliedDate = LocalDate.of(2022, 10, 28);

        System.out.println(LocalDate.now());


        if (todayDate.compareTo(interestAppliedDate) == 0) {
            //System.out.println("Called");
            double solution = getBalance()*(1.0+interestRate);
            setBalance(Double.parseDouble(dfZero.format(solution)));

        }
    }



    /**
     *
     SavingsAccount

     A SavingsAccount should have an interest rate

     */

}
