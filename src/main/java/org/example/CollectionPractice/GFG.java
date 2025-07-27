package org.example.CollectionPractice;

import java.util.ArrayList;

public class GFG {
    public static void main(String[] args) {
        RevArrayList obj = new RevArrayList();

        // Declaring arraylist without any initial size
        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        // Appending elements at the end of the list
        arraylist.add(new Integer(1));
        arraylist.add(new Integer(2));
        arraylist.add(new Integer(3));
        arraylist.add(new Integer(4));
        System.out.print("Elements before reversing:");
        obj.printElements(arraylist);

        arraylist = obj.reverseArrayList(arraylist);
        System.out.print("\nElements after reversing:");
        obj.printElements(arraylist);
    }
}
