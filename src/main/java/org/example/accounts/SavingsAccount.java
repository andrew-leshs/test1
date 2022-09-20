package org.example.accounts;

public class SavingsAccount extends Account implements MoneyTarget{

    protected long minBalance;

    public SavingsAccount(String name, long balance, long minBalance) {
        super(name, balance);
        this.minBalance = minBalance;
    }

    @Override
    public boolean pay(long amount) {
        if (amount > 0 && amount >= minBalance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Ошибка");

            return false;
        }
    }

    @Override
    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            System.out.println("Ошибка");

            return false;
        }
    }

    @Override
    public boolean transfer(Account accountTo, int amount) {
        pay(amount);
        if (accountTo.add(amount)){
            System.out.println("Успешный перевод!");
            return true;
        } else {
            add(amount);
            System.out.println("Ошибка, средства возращены!");
            return false;
        }
    }
}
