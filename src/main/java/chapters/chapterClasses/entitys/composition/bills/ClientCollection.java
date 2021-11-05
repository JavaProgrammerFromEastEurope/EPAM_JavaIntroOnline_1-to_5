package chapters.chapterClasses.entitys.composition.bills;

import application.sortComparator.impl.classes.bills.SortByAccount;

import java.util.ArrayList;
import java.util.List;

public class ClientCollection {

    public final List<Client> clients;

    public ClientCollection() {
        clients = new ArrayList<>();
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Client> sortAccountsByBalance() {
        clients.sort(new SortByAccount());
        return clients;
    }

    public Account findAccount(int bankAcc) {
        for (Client client : clients) {
            for (Account account : client.getAccounts()) {
                if (account.getBankAccountNumber() == bankAcc) {
                    return account;
                }
            }
        }
        return null;
    }

    public int getClientAccountsSum(Client client) {
        int sum = 0;
        for (Account account : client.getAccounts()) {
            sum += account.getBalance();
        }
        return sum;
    }
}