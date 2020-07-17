package main.java.com.collections.lists;

import main.java.com.collections.comparator.NewComparator;

import java.util.*;

public class OperationsWithSet {

    public static Set<Integer> initSet(Integer...nums) {
        Set<Integer> set = new TreeSet<>(new NewComparator());
        Collections.addAll(set, nums);
        return set;
    }

    public static void printSet(Set<Integer> set) {
        System.out.println("\nTreeSet sorted by descending:\n" + set);
    }
}