package main.java.com.collections.tasks;

import java.util.ArrayList;
import java.util.List;

public class Fruits{

    public static void addFruits(){

        List<String> firstBasket = new ArrayList<>();

        firstBasket.add("Mango");
        firstBasket.add("Kiwi");
        firstBasket.add("Orange");
        firstBasket.add("Banana");
        firstBasket.add("Apple");
        firstBasket.add("Avocado");

        System.out.println("List of fruits in first basket: ");
        Fruits.printFruits(firstBasket);
        Fruits.swapFruits(firstBasket);

        System.out.println("\nList of fruits in first basket after checking: ");
        Fruits.printFruits(firstBasket);

        List<String> secondBasket = new ArrayList<>();
        secondBasket.add("Tangerine");
        secondBasket.add("Pear");
        secondBasket.add("Banana");
        secondBasket.add("Coconut");

        System.out.println("\nList of fruits in second basket: ");
        Fruits.printFruits(secondBasket);
        Fruits.swapFruits(secondBasket);
    }

    public static void printFruits(List<String> fruits){
        for (Object elem: fruits) {
            System.out.print(elem + " ");
        }
        System.out.println(" ");
    }

    public static void swapFruits(List<String> fruits){
        final String CHECK_FRUIT = "Orange";

        if(fruits.contains(CHECK_FRUIT)){
            fruits.set(fruits.indexOf(CHECK_FRUIT), "Grapefruit");
        } else {
            System.out.println("\nThere is no such fruit");
        }
    }
}
