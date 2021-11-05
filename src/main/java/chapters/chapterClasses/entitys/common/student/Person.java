package chapters.chapterClasses.entitys.common.student;

import java.util.GregorianCalendar;
import java.util.Objects;

import static java.lang.String.*;

class Person  {

    private final String firstName;
    private final String lastName;
    private final GregorianCalendar dateOfBirth;

    Person() {
        this.firstName = "Stan";
        this.lastName =  "Marsh";
        this.dateOfBirth = new GregorianCalendar();
    }

    Person(String firstName, String lastName, GregorianCalendar dateOfBirth) {
        if (firstName == null || lastName == null || dateOfBirth == null)
            throw new NullPointerException();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    private GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(dateOfBirth, person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth);
    }

    public String toString() {
        return format("%s %s\t%s", firstName, lastName, dateOfBirth.getTime());
    }

    public String toListString() {
        return format("%s %s\t%s", firstName, lastName, dateOfBirth.getTime());
    }
}