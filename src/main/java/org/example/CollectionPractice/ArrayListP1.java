package org.example.CollectionPractice;

import java.util.*;

public class ArrayListP1 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(101);
        al.add(102);
        al.add(103111);
        al.add(104);
        al.add(105);
        al.add(1060000);
        al.add(107);
        al.add(108);
        al.add(109);

        Collections.reverse(al);
        System.out.println(al);
    }
}
