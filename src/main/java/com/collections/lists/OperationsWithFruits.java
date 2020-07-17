package main.java.com.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OperationsWithFruits {
    public static final String CHECK_FRUIT = "Orange";

    public static List<String> addFruits(String...fruits) {
        List<String> basketWithFruits = new ArrayList<>();
        Collections.addAll(basketWithFruits, fruits);
        return basketWithFruits;
    }

    public void printFruits(List<String> fruits) {
        for (Object elem : fruits) {
            System.out.print(elem + " ");
        }
        System.out.println(" ");
    }

    public void swapFruits(List<String> fruits) {
        if (fruits.contains(CHECK_FRUIT)) {
            fruits.set(fruits.indexOf(CHECK_FRUIT), "Grapefruit");
        } else {
            System.out.println("\nThere is no " + CHECK_FRUIT);
        }
    }
}
