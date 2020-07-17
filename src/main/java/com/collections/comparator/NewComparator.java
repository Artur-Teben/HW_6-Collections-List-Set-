package main.java.com.collections.comparator;

import java.util.Comparator;

public class NewComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer x, Integer y) {
        return y - x;
    }
}
