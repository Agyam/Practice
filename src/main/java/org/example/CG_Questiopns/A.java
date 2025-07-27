package org.example.CG_Questiopns;
//DAY1

import java.util.*;
import java.util.stream.Collectors;

/**
 * Q1) Given a list of integers, find out all the even numbers exist in the list using Stream functions?
 * <p>
 * Q2) Given a list of integers, find out all the numbers starting with 1 using Stream functions?
 * <p>
 * Q3) How to find duplicate elements in a given integers list in java using Stream functions?
 * <p>
 * Q4) Given the list of integers, find the first element of the list using Stream functions?
 * <p>
 * Q5) Given a list of integers, find the total number of elements present in the list using Stream functions?
 * <p>
 * 06) Given a list of integers, find the maximum value element present in it using Stream functions?
 * <p>
 * 07) Given a String, find the first non-repeated character in it using Stream functions?
 * <p>
 * Q8) Given a String, find the first repeated character in it using Stream functions? |
 * <p>
 * 09) Given a list of integers, sort all the values present in it using Stream functions?
 * <p>
 * Q10) Given a list of integers, sort all the values present in it in descending order using Stream functions?
 * <p>
 * Q11) Write a Java 8 program to concatenate two Streams?
 * <p>
 * Q12) Write a Java 8 program to find the number of Strings in a list whose length is greater than 5?
 * <p>
 * Q13) Explain Stringloiner Class in Java 8? How can we achieve joining multiple Strings using Stringloiner Class?
 * <p>
 * Q14) Find the Word/number got repeated by using Stream API (input: 2,3,34,5,5,4,3,3,3 output: 2-1,3-4,34-1,5-2,4-1)
 * <p>
 * Q15) Write a Java Lambda Expression to Create a Thread
 * <p>
 * Q16) How Lambda Expression and Functional Interfaces are Related? Q17
 * <p>
 * Q17) Given a list of Strings, convert each String to uppercase and join them with comma (,) using Stream API (List-["USA", "Japan", "France", ...])
 * <p>
 * Q18) Given a list of Integers, find square of all distinct numbers by using Stream API (list-[9, 10, 3, 4, 7, 3, 4]) 019) Given a list of Integers, find total count, min, max, sum, and average using Stream API (input: [2, 3, 5, ...])
 * <p>
 * ( 28) Given list input: ["Himanshu", "Devraj12", "cajeesh", "pavan", "sachine"), create Map output: (5-[pavao), 7-[cajeesh, sachine), 8-[Himanshu, Devraj12]}
 * <p>
 * Q21) Given String str "tello", toggle it to str-IELCO
 */
public class A {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(10);
        al.add(11);
        al.add(9);
        al.add(12);
        al.add(9);
        findEvenAndOdd(al);
        findAllNumbersStartingWith1(al);
        findAllDuplicate(al);
    }

    //    Given a list of integers, find out all the even numbers exist in the list using Stream functions
    private static void findEvenAndOdd(List al) {
        System.out.println(al.stream().filter(i -> Integer.parseInt(i.toString()) % 2 == 0).collect(Collectors.toList()));
    }

    //    Given a list of integers, find out all the numbers starting with 1 using Stream functions
    private static void findAllNumbersStartingWith1(List al) {
        System.out.println(al.stream().filter(i -> i.toString().startsWith("1")).collect(Collectors.toList()));
    }

//    How to find duplicate elements in a given integers list in java using Stream functions
    private static void findAllDuplicate(List al){
        Set<Integer> seen = new HashSet<>();
        System.out.println(al.stream().filter(i ->!seen.add((Integer) i)).distinct().collect(Collectors.toList()));
    }
}
