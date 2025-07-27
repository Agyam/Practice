package org.example.CG_Questiopns.QuestionsSet;

import java.util.*;
import java.util.stream.*;
/**
 * Q4 Given the list of integers, find the first element of the list using Stream functions?
 */
public class Question004 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(15, 25, 35, 45);

        Integer first = numbers.stream()
                .findFirst()
                .orElse(null); // returns null if list is empty

        System.out.println("First element: " + first);
    }
}
