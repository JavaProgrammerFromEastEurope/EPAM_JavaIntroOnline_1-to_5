package application.sortComparator.impl.classes.bills;

import application.sortComparator.ISortTemplate;
import chapters.chapterClasses.entitys.composition.bills.Account;
import chapters.chapterClasses.entitys.composition.bills.Client;

public class SortByAccount implements ISortTemplate<Client> {

    @Override
    public int compare(Client o1, Client o2) {
        o1.getAccounts().sort(Account::compareTo);
        o2.getAccounts().sort(Account::compareTo);
        return o1.getAccounts().hashCode()
             - o2.getAccounts().hashCode();
    }
}
