package org.example.clients;

import org.example.accounts.CheckingAccount;
import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

    @Test
    public void testAdd() {
        Client client = new Client("Tanya", 0);
        boolean b = client.add(new CheckingAccount("Tanya", 10));
        Assert.assertFalse(b);
    }

    @Test
    public void testPay() {
        Client client = new Client("Tanya", 2);
        client.add(new CheckingAccount("Tanya", 10));
        boolean b = client.pay(10);
        Assert.assertTrue(b);
    }

    @Test
    public void testAccept() {
        Client client = new Client("Tanya", 2);
        client.add(new CheckingAccount("Tanya", 100));
        boolean b = client.accept(100);
        Assert.assertTrue(b);
    }
}