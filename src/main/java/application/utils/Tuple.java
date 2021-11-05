package application.utils;

public final class Tuple<T> {

    private final T firstItem;
    private final T secondItem;

    public Tuple(T firstItem, T secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public T getFirstItem() {
        return firstItem;
    }

    public T getSecondItem() {
        return secondItem;
    }
}
