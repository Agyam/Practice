package org.example.CollectionSelfPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListPractice {
    /**
     * Add & Iterate:
     * Create an ArrayList of Strings, add 5 names, and print them using a for-each loop.
     *
     * Remove by Value & Index:
     * Remove the 2nd element and remove an element by name.
     *
     * Update Elements:
     * Replace the 3rd element with a new name using set().
     *
     * Check Existence:
     * Check if a particular name exists in the list using contains().
     *
     * Sort & Reverse:
     * Sort the list alphabetically, then reverse it using Collections.reverse().
     *
     * Merge Lists:
     * Merge two ArrayLists into one and remove duplicates using a Set.
     *
     * Find Common Elements:
     * Find and print common elements between two ArrayLists using retainAll().
     *
     * Remove All Common:
     * Remove all elements from list1 that are present in list2 using removeAll().
     *
     * SubList and Clear:
     * Create a subList from index 2 to 4, print it, then clear the original list.
     *
     * Random Integers:
     * Generate an ArrayList of 10 random integers (1-100), sort and print them.
     */

    public static void main(String[] args) {
//        Create an ArrayList of Strings, add 5 names, and print them using a for-each loop.
        createAddAndItrate();
    }

    private static void createAddAndItrate() {
//        Create an ArrayList of Strings
        ArrayList<String> al = new ArrayList<>();
//        add 5 names
        al.add("agyam");
        al.add("hari");
        al.add("gopi");
        al.add("vicky");
        al.add("majnu");
//        print them using a for-each loop
        for(String s:al){
            System.out.println(s);
        }
        removeByValueAndIndex(al);
        setWithIndex(al);
        checkExistance(al);
        sortAndReverse(al);
        newArrayListAndMeargeAndRemoveDuplicates(al);
        findSublistAndClear(al);
        generateRandomNumbers();

    }

    private static void generateRandomNumbers() {
        Random r = new Random();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0;i<10;i++){
            int num= r.nextInt(100)+1;
            al.add(num);
        }
        al.sort(Integer::compareTo);
        System.out.println(al);
    }

    private static void findSublistAndClear(ArrayList<String> al) {
        ArrayList<String> list=new ArrayList<>(al.subList(1,3));
        System.out.println(list);
        al.clear();
        System.out.println(al);
    }

    private static void newArrayListAndMeargeAndRemoveDuplicates(ArrayList<String> al1) {
        ArrayList<String> al = new ArrayList<>();
        al.add("agyam Naik");
        al.add("hari har");
        al.add("gopi krishna");
        al.add("vicky");
        al.add("majnu");
        mearge2ArrayList(al,al1);
        findCommons(al,al1);
        removeCommons(al,al1);
    }
    private static void removeCommons(ArrayList<String> al,ArrayList<String> al1) {
        al.removeAll(al1);
        System.out.println(al);
    }
    private static void findCommons(ArrayList<String> al,ArrayList<String> al1) {
        al.retainAll(al1);
        System.out.println(al);
    }
    private static void mearge2ArrayList(ArrayList<String> al, ArrayList<String> al1) {
        ArrayList<String> al2 = new ArrayList<>();
        al2.addAll(al1);
        al2.addAll(al);
        System.out.println(al2);
        al1.retainAll(al);
        al2.removeAll(al1);
        System.out.println(al2);
    }

    private static void sortAndReverse(ArrayList<String> al) {
//        Sort the list alphabetically, then reverse it using Collections.reverse().
        al.sort(String::compareToIgnoreCase);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
    }
    private static void checkExistance(ArrayList<String> al) {
        System.out.println(al.contains("gopi"));
        System.out.println(al.contains("gopinath"));
    }
    private static void setWithIndex(ArrayList<String> al) {
        al.set(2,"karuna");
        System.out.println(al);
    }
    private static void removeByValueAndIndex(ArrayList<String> al) {
        al.remove(1);
        System.out.println(al);
        al.remove("majnu");
        al.remove(al.lastIndexOf("gopi"));
        System.out.println(al);
    }
}