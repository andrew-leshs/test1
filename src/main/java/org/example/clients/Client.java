package org.example.clients;
import org.example.accounts.Account;
import org.example.accounts.MoneyTarget;

public class Client implements MoneyTarget {
    private String name;
    private int max_accounts;
    private Account[] accounts;

    public Client(String name, int max_accounts) {
        this.name = name;
        this.max_accounts = max_accounts;
        this.accounts = new Account[max_accounts];
    }

    public boolean add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return true;
            }
        }
        return false;
    }

    public boolean pay(int amount) {
        for (Account account : accounts) {
            if (account.pay(amount)) {
                System.out.println("Успешно");
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(int money) {
        for (Account account : accounts) {
            if (account == null) {
                continue;
            }
            if (account.accept(money)){
                System.out.println("Accepted");
                return true;
            }
        }
        return false;
    }
}
