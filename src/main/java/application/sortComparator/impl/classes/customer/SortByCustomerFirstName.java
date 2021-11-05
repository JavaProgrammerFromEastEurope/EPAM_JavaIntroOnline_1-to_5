package application.sortComparator.impl.classes.customer;

import application.sortComparator.ISortTemplate;
import chapters.chapterClasses.entitys.common.customer.Customer;

public class SortByCustomerFirstName implements ISortTemplate<Customer> {

    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getFirstName().compareTo(c2.getFirstName());
    }
}
