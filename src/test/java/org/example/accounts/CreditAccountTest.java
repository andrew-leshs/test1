package org.example.accounts;

import org.junit.Assert;
import org.junit.Test;

public class CreditAccountTest {

    @Test
    public void testPay() {
        CreditAccount creditAccount = new CreditAccount("Tanya", 0);
        boolean b = creditAccount.pay(10000);
        Assert.assertTrue(b);
    }

    @Test
    public void testAdd() {
        CreditAccount creditAccount = new CreditAccount("Tanya", 0);
        boolean b = creditAccount.add(10000);
        Assert.assertFalse(b);
    }

    @Test
    public void testTransfer() {
        CreditAccount creditAccount = new CreditAccount("Tanya", -1000);
        boolean b = creditAccount.transfer(new CheckingAccount("Tanya", 1000), 1000);
        Assert.assertTrue(b);
    }
}