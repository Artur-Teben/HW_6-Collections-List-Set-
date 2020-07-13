package main.java.com.collections.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimilarElements {

    public static void checkElem() {

        System.out.println("First number list: ");
        List<Integer> numbers1 = new ArrayList<>();

        randInitList(15, numbers1);

        System.out.println("\n\nSecond number list: ");
        List<Integer> numbers2 = new ArrayList<>();

        randInitList(13, numbers2);

        System.out.println("\n\nSimilar elements: ");
        numbers1.retainAll(numbers2);
        System.out.println(numbers1);
    }

    public static void randInitList(int m, List<Integer> list) {
        for (int i = 0; i < m; i++) {
            list.add(new Random().nextInt(20));
            System.out.print(list.get(i) + " ");
        }
    }
}
