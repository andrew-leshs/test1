package org.example.accounts;

import org.junit.Assert;

public class CheckingAccountTest {

    @org.junit.Test
    public void testPay() {
        CheckingAccount checkingAccount = new CheckingAccount("Tanya", 10000);
        boolean b = checkingAccount.pay(500);
        Assert.assertTrue(b);
    }

    @org.junit.Test
    public void testAdd() {
        CheckingAccount checkingAccount = new CheckingAccount("Tanya", 10000);
        boolean b = checkingAccount.add(1);
        Assert.assertTrue(b);
    }

    @org.junit.Test
    public void testTransfer() {
        CheckingAccount checkingAccount = new CheckingAccount("Tanya", 10000);
        Account account = new SavingsAccount("Tanya", 10000, 100);
        boolean b = checkingAccount.transfer(account, 10000);
        Assert.assertTrue(b);
    }
}