package chapters.chapterClasses.entitys.common.customer;

import java.text.MessageFormat;
import java.util.Objects;

public class Person {

    private final String firstName;
    private final String lastName;
    private final String address;

    public Person(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(address, person.address);
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address);
    }

    @Override
    public String toString() {
        return MessageFormat.format("Person'" +
                "{'firstName=''{0}'', lastName=''{1}'', address=''{2}'''}'",
                firstName, lastName, address);
    }
}