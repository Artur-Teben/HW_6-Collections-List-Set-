package main.java.com.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class DivisionByThree {

    public static void divideByThree(){
        List<Integer> intArrayList = DivisionByThree.initList();

        System.out.println("ArrayList before remove numbers which are divisible by 3: ");
        DivisionByThree.printList(intArrayList);

        intArrayList.removeIf(n -> (n % 3) == 0);

        System.out.println("\n\nArrayList after remove numbers which are divisible by 3: ");
        DivisionByThree.printList(intArrayList);
    }

    //Initialization list by numbers as specified in the task
    public static List<Integer>  initList() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        return list;
    }

    public static void printList(List<Integer> list) {
        for (Integer elem: list) {
            System.out.print(elem + " ");
        }
    }
}

