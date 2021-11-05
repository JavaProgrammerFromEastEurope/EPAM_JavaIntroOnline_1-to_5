package application.sortComparator.impl.function;

import application.sortComparator.ISortTemplate;

public class SortByLengthWord implements ISortTemplate<String> {

    @Override
    public int compare(String o1, String o2) {
        return  o2.length() - o1.length();
    }
}