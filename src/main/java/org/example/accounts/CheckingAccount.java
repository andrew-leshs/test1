package org.example.accounts;

public class CheckingAccount extends Account implements MoneyTarget{

    protected long minBalance = 0;

    public CheckingAccount(String name, long balance) {
        super(name, balance);
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= balance && amount > 0) {
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
