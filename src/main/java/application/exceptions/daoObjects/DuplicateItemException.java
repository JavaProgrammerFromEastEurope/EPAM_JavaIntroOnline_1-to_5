package application.exceptions.daoObjects;

public class DuplicateItemException extends Exception {

    private final long id;

    public DuplicateItemException(long id) {
        this.id = id;
    }

    public String getMessage() {
        return String.format("Duplicate item with id = %d", id);
    }
}
