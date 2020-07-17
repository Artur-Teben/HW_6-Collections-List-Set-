package main.java.com.collections;

import main.java.com.collections.lists.DivisionByThree;
import main.java.com.collections.lists.Fruits;
import main.java.com.collections.lists.SimilarElements;
import main.java.com.collections.lists.SortSetByDescending;

public class Executor {
    public static void executeApplication() {
        System.out.println("\t\t\t\t\t\tTASK #1");
        DivisionByThree.division();

        System.out.println("\n\t\t\t\t\t\tTASK #2");
        Fruits.addFruits();

        System.out.println("\n\t\t\t\t\t\tTASK #3");
        SimilarElements.checkElem();

        System.out.println("\n\t\t\t\t\t\tTASK #4");
        SortSetByDescending.printSortedIntElem();
    }
}
