package main.java.com.collections.tasks;

import java.util.ArrayList;

public class Fruits{

    public void addFruits(){

        ArrayList<String> firstBasket = new ArrayList<>();

        firstBasket.add("Mango");
        firstBasket.add("Kiwi");
        firstBasket.add("Orange");
        firstBasket.add("Banana");
        firstBasket.add("Apple");
        firstBasket.add("Avocado");

        Fruits fr = new Fruits();

        System.out.println("List of fruits in first basket: ");
        fr.printFruits(firstBasket);
        fr.swapFruits(firstBasket);

        System.out.println("\nList of fruits in first basket after checking: ");
        fr.printFruits(firstBasket);

        ArrayList<String> secondBasket = new ArrayList<>();
        secondBasket.add("Tangerine");
        secondBasket.add("Pear");
        secondBasket.add("Banana");
        secondBasket.add("Coconut");

        System.out.println("\nList of fruits in second basket: ");
        fr.printFruits(secondBasket);
        fr.swapFruits(secondBasket);
    }

    public void printFruits(ArrayList fruits){
        for (Object elem: fruits) {
            System.out.print(elem + " ");
        }
        System.out.println(" ");
    }

    public ArrayList swapFruits(ArrayList fruits){

        if(fruits.contains("Orange")){
            fruits.set(fruits.indexOf("Orange"), "Grapefruit");
        } else {
            System.out.println("\nThere is no such fruit");
        }
        return fruits;
    }
}
