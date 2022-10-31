package com.qa;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CurrentAccountTest {

    @Test
    public void test_Current_Acc_Over_WithdrawLimit() {
        //Arrange
        CurrentAccount currentAcc = new CurrentAccount();
        currentAcc.setWithdrawalAmount(200.00);
        currentAcc.depositCash(500.00);

        double amountInBank = currentAcc.getBalance();
        //Act
        currentAcc.withdrawCash(300.00);

        //Assert

        assertEquals( amountInBank ,currentAcc.getBalance());
    }

    @Test
    public void test_Current_Acc_Under_WithdrawLimit() {
        //Arrange
        CurrentAccount currentAcc = new CurrentAccount();
        currentAcc.setWithdrawalAmount(200.00);
        currentAcc.depositCash(500.00);

        double amountInBank = currentAcc.getBalance();
        //Act
        currentAcc.withdrawCash(150.00);

        //Assert
        System.out.println(currentAcc.getBalance());
        assertEquals( amountInBank-150.00 ,currentAcc.getBalance());
    }

}
