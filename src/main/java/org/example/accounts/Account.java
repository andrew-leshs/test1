package org.example.accounts;

public abstract class Account implements MoneyTarget{
    protected String name;
    protected long balance;

    public Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    public long getBalance() {
        return balance;
    }

    public abstract boolean pay(long amount);

    public abstract boolean add(long amount);

    public boolean accept(int money) {
        return add(money);
    }

    public abstract boolean transfer(Account accountTo, int amount);
}
