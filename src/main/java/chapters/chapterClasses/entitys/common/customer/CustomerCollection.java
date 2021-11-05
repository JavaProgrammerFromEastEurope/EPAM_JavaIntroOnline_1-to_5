package chapters.chapterClasses.entitys.common.customer;

import application.sortComparator.impl.classes.customer.SortByCustomerFirstName;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.text.MessageFormat.format;

public class CustomerCollection {

    public final List<Customer> customerList;

    public CustomerCollection() {
        customerList = new ArrayList<>();
    }

    public List<Customer> sortByCustomerFirstName() {
        customerList.sort(new SortByCustomerFirstName());
        return customerList;
    }

    public static void getCustomerCreditCardNumber(List<Customer> customerList, int low, int high) {
        out.println(format(" List of customers with credit card number" +
                " from {0} to {1}:", low, high));

        Map<Boolean, List<Customer>> customerListByValue = customerList.stream()
                .collect(Collectors.partitioningBy(customer ->
                        customer.getCreditCardNumber() >= low
                     && customer.getCreditCardNumber() <= high));

        customerListByValue.forEach((k, v) -> out.println("Key:" + k + "  " +
                v.stream().map(Customer::toString).collect(Collectors.joining(","))));
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}