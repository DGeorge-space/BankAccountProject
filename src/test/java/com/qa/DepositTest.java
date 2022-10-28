package com.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositTest {

    @Test
    public void test_deposit_cash() {
        //Arrange
        BankAccount userAccount = new BankAccount();
        userAccount.setBalance( 1000.00);

        double expectedAnswer = 3200.00;

        //Act
        userAccount.depositCash( 2200.00);

        //Assert
        assertEquals(expectedAnswer, userAccount.getBalance());

    }

    @Test
    public void test_withdraw_cash() {
        //Arrange
        BankAccount userAccount = new BankAccount();
        userAccount.setBalance( 3000.00);

        double expectedAnswer = 3000.00;

        //Act
        userAccount.withdrawCash( 5000.00);

        //Assert
        assertEquals(expectedAnswer, userAccount.getBalance());

    }
}
