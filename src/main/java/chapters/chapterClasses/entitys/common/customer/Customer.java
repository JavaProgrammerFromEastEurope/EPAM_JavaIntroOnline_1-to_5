package chapters.chapterClasses.entitys.common.customer;

import java.text.MessageFormat;
import java.util.Objects;

public class Customer extends Person {

    private static long counter = 1;
    private final  long id = counter++;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer(String firstName, String lastName, String address,
                     int creditCardNumber, int bankAccountNumber) {
        super(firstName, lastName, address);
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }


    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return id == customer.id
                && creditCardNumber == customer.creditCardNumber
                && bankAccountNumber == customer.bankAccountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),
                id, creditCardNumber, bankAccountNumber);
    }

    @Override
    public String toString() {
        return MessageFormat.
                format("Customer'{'id={0}, creditCardNumber={1}," +
                        " bankAccountNumber={2}'}'", id, creditCardNumber,
                        bankAccountNumber);
    }
}