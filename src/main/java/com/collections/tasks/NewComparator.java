package main.java.com.collections.tasks;

import java.util.Comparator;

public class NewComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer x, Integer y) {
        return x.compareTo(y);
    }
}
