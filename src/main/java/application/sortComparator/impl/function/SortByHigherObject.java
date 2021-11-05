package application.sortComparator.impl.function;

import application.sortComparator.ISortTemplate;

public class SortByHigherObject implements ISortTemplate<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        return (int) o2 - (int) o1;
    }
}