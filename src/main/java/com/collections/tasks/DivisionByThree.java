package main.java.com.collections.tasks;

import java.util.ArrayList;
import java.util.List;

public class DivisionByThree {

    public static void division(){
        List<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(3);
        intArrayList.add(9);
        intArrayList.add(11);
        intArrayList.add(18);
        intArrayList.add(20);
        intArrayList.add(22);

        System.out.println("ArrayList before remove numbers which are divisible by 3: ");
        DivisionByThree.printArrayList(intArrayList);

        intArrayList.removeIf(n -> (n % 3) == 0);

        System.out.println("\n\nArrayList after remove numbers which are divisible by 3: ");
        DivisionByThree.printArrayList(intArrayList);
    }

    public static void printArrayList(List<Integer> list) {
        for (Integer elem: list) {
            System.out.print(elem + " ");
        }
    }
}

