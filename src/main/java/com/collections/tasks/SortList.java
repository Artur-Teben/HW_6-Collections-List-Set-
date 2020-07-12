package main.java.com.collections.tasks;

import java.util.TreeSet;

public class SortList {

    public void printSortedIntElem() {
        TreeSet <Integer> set = new TreeSet<>();
        set.add(22);
        set.add(11);
        set.add(55);
        set.add(44);
        set.add(33);
        System.out.println("\nTreeSet before sorting by descending:\n" + set);
        System.out.println("\nTreeSet sorted by descending:\n" + set.descendingSet());
    }

}
