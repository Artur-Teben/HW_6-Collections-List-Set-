package main.java.com.collections;

import main.java.com.collections.lists.DivisionByThree;
import main.java.com.collections.lists.OperationsWithFruits;
import main.java.com.collections.lists.SimilarElements;
import main.java.com.collections.lists.OperationsWithSet;

import java.util.List;
import java.util.Set;

public class Executor {
    public void executeApplication() {
        System.out.println("\t\t\t\t\t\tTASK #1");
        DivisionByThree.divideByThree();

        System.out.println("\n\t\t\t\t\t\tTASK #2");

        OperationsWithFruits fruits = new OperationsWithFruits();
        List<String> firstBasket = OperationsWithFruits.addFruits("Mango", "Kiwi", "Orange", "Banana", "Apple", "Avocado");

        System.out.println("List of fruits in first basket: ");
        fruits.printFruits(firstBasket);
        fruits.swapFruits(firstBasket);

        System.out.println("\nList of fruits in first basket after checking: ");
        fruits.printFruits(firstBasket);

        List<String> secondBasket = OperationsWithFruits.addFruits("Tangerine", "Pear", "Banana", "Coconut");

        System.out.println("\nList of fruits in second basket: ");
        fruits.printFruits(secondBasket);
        fruits.swapFruits(secondBasket);

        System.out.println("\n\t\t\t\t\t\tTASK #3");
        SimilarElements.checkElem();

        System.out.println("\n\t\t\t\t\t\tTASK #4");
        Set<Integer> intSet = OperationsWithSet.initSet(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OperationsWithSet.printSet(intSet);
    }
}
