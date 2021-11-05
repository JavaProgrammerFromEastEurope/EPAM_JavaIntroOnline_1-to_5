package application.sortComparator;

import java.util.Comparator;

public interface ISortTemplate<T> extends Comparator<T> {

    @Override
    int compare(T o1, T o2);
}
