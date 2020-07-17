package main.java.com.collections.lists;

import main.java.com.collections.comparator.NewComparator;

import java.util.*;

public class OperationsWIthSet {

    public static void printSortedIntElem() {
        Set<Integer> set = new TreeSet<>(new NewComparator());
        set.add(22);
        set.add(11);
        set.add(55);
        set.add(44);
        set.add(33);
        System.out.println("\nTreeSet sorted by descending:\n" + set);
    }

    public static Set<Integer> sortByDescending(Set<Integer> set) {
        
        return set;
    }

    public static Set<Integer> initSet(Integer...nums) {
        Set<Integer> set = new TreeSet<>();
        Collections.addAll(set, nums);
        return set;
    }

    public static void printSet(Set<Integer> set) {
        System.out.println("\nTreeSet sorted by descending:\n" + set);
    }
}