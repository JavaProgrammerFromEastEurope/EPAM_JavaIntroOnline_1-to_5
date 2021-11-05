package chapters.chapterClasses.entitys.composition.bills;

import java.util.Objects;

import static java.lang.System.out;

public class Account implements Comparable<Account> {

    private final int bankAccountNumber;
    private int balance;

    public Account(int bankAccountNumber, int balance) {
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) {
        String name = Thread.currentThread().getName();
        out.printf("%s want get %d%n", name, money);
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= money;
            out.printf("%s have %d left on the account: %d%n", name, money, balance);
        } else {
            out.printf("For an account %s: not enough money.%n", name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balance == account.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance);
    }

    @Override
    public int compareTo(Account o) {
        return balance - o.getBalance();
    }

    @Override
    public String toString() {
        return String.format("balance= %d}", balance);
    }
}