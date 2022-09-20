package org.example;
import org.example.accounts.CreditAccount;
import org.example.clients.Client;

public class Main {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount("Tanya", -1000000);
        Client client = new Client("Olya", 2);
        client.add(creditAccount);
        client.accept(1000);
    }
}
