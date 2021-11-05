package chapters.chapterClasses.entitys.common.book;

import java.util.Objects;

import static java.text.MessageFormat.format;

public class Book {

    private static long counter = 1;
    private final long id = counter++;

    private String author;
    private String name;
    private String publisher;
    private int publicationYear;
    private int numberOfPages;
    private String bindingType;
    private int quantity;
    private int cost;


    public Book(String author, String name, String publisher, int publicationYear,
                int numberOfPages, String bindingType, int quantity, int cost) {
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
        this.bindingType = bindingType;
        this.quantity = quantity;
        this.cost = cost;
    }

    public static void setCounter(long counter) {
        Book.counter = counter;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static long getCounter() {
        return counter;
    }

    public long getId() {
        return id;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getCost() {
        return cost;
    }

    public String getBindingType() {
        return bindingType;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id
                && publicationYear == book.publicationYear
                && numberOfPages == book.numberOfPages
                && quantity == book.quantity
                && cost == book.cost
                && Objects.equals(bindingType, book.bindingType)
                && Objects.equals(publisher, book.publisher)
                && Objects.equals(name, book.name)
                && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, publicationYear, numberOfPages,
                quantity, cost, bindingType,
                publisher, name, author);
    }

    @Override
    public String toString() {
        return format("Book'{'id={0}, publicationYear={1}," +
                        " numberOfPages={2}, quantity={3}, cost={4}, bindingType=''{5}''," +
                        " publicity=''{6}'', name=''{7}'', author=''{8}'''}'",
                id, publicationYear, numberOfPages, quantity, cost,
                bindingType, publisher, name, author);
    }
}