package main.java.com.collections.lists;

import main.java.com.collections.comparator.NewComparator;

import java.util.Set;
import java.util.TreeSet;

public class SortSetByDescending {

    public static void printSortedIntElem() {
        Set<Integer> set = new TreeSet<>(new NewComparator());
        set.add(22);
        set.add(11);
        set.add(55);
        set.add(44);
        set.add(33);
        System.out.println("\nTreeSet sorted by descending:\n" + set);
    }
}