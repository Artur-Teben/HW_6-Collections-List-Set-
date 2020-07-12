package main.java.com.collections;

import main.java.com.collections.tasks.DivisionByThree;
import main.java.com.collections.tasks.Fruits;
import main.java.com.collections.tasks.SimilarElements;
import main.java.com.collections.tasks.SortList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\tTASK #1");
        DivisionByThree numb = new DivisionByThree();
        numb.division();

        System.out.println("\n\t\t\t\t\t\tTASK #2");
        Fruits fr1 = new Fruits();
        fr1.addFruits();

        System.out.println("\n\t\t\t\t\t\tTASK #3");
        SimilarElements simElem = new SimilarElements();
        simElem.checkElem();

        System.out.println("\n\t\t\t\t\t\tTASK #4");
        SortList srtList = new SortList();
        srtList.printSortedIntElem();
    }
}
