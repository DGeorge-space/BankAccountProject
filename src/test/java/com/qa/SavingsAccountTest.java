package com.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {
    @Test
    public void test_savings_account_deposit_cash(){
        //Arrange
        SavingsAccount savingsAccountUser = new SavingsAccount();
        savingsAccountUser.setBalance(100.00);

        double expected_answer = 250.00;
        //Act
        savingsAccountUser.depositCash(150.00);

        //Assert
        assertEquals(expected_answer, savingsAccountUser.getBalance());
    }
    @Test

    public void test_apply_interest_to_savings_account(){
        //Arrange
        SavingsAccount savingsAccountUser = new SavingsAccount();
        savingsAccountUser.setBalance(100.00);

        double expected_answer = 100.50;
        //Act
        savingsAccountUser.applyInterest();

        //Assert
        assertEquals(expected_answer, savingsAccountUser.getBalance(),0.01);
    }
}
