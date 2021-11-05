package application.exceptions.daoObjects;

public class NotFoundItemException extends Exception {

    private final long id;

    public NotFoundItemException(long id) {
        this.id = id;
    }

    public String getMessage() {
        return String.format("Not found item with id = %d", id);
    }
}
