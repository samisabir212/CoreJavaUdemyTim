package javaCollectionsFramework.javaGenerics;

import java.util.ArrayList;

/**
 * Created by sami on 5/28/17.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>(); //<Integer> is saying this is the type that we are using in this array list

        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tim");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) { //specifying the type of data we are saving in our arrayList
        for (int i : n) {
            System.out.println(i * 2);
        }
    }

}