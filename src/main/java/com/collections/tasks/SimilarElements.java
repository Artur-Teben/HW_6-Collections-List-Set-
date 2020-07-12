package main.java.com.collections.tasks;

import java.util.ArrayList;
import java.util.Random;

public class SimilarElements {
    public void checkElem() {

        System.out.println("First number list: ");
        ArrayList<Integer> numbers1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers1.add(new Random().nextInt(20));

            System.out.print(numbers1.get(i) + " ");
        }

        System.out.println("\n\nSecond number list: ");
        ArrayList<Integer> numbers2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers2.add(new Random().nextInt(20));

            System.out.print(numbers2.get(i) + " ");
        }

        System.out.println("\n\nSimilar elements: ");
        numbers1.retainAll(numbers2);
        System.out.println(numbers1);
    }
}
