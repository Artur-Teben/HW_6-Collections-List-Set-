package main.java.com.collections.tasks;

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
