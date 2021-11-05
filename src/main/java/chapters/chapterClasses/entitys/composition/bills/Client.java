package chapters.chapterClasses.entitys.composition.bills;

import java.util.ArrayList;

public class Client extends Thread {

    private final ArrayList<Account> accounts;

    public Client(String name, ArrayList<Account> accounts) {
        setName(name);
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            accounts.get(0).withdraw(100);
        }
    }

    @Override
    public String toString() {
        return String.format("Customer - %s accounts = %s", getName(), accounts);
    }
}