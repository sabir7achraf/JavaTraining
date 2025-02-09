package ma.ecole.HackerRank;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Spliting {


    public static void main(String[] args) {


        // Create the original LinkedList
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Apple");
        originalList.add("Banana");

        // Create a shallow copy using clone()
     LinkedList<String> clonedList = (LinkedList<String>) originalList.clone();
       Iterator<String> iterator = clonedList.listIterator();
//
//        System.out.println("Original List: " + originalList);
//        System.out.println("Cloned List: " + clonedList);
//
//        // Modify the original list
//        clonedList.add("Mango");
//
//        System.out.println("After modification:");
//        System.out.println("Original List: " + originalList);
//        System.out.println("Cloned List: " + clonedList);

        while   (iterator.hasNext()) {
            String item = iterator.next();
            if(item.equals("Apple")) {
                iterator.remove();
            }
            System.out.println(item);
        }
            }


}
