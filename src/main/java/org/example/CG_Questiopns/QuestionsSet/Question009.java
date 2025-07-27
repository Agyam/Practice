package org.example.CG_Questiopns.QuestionsSet;

/**
 * Given a list of integers, sort all the values present in it using Stream functions?
 */
import java.util.*;
import java.util.stream.*;

public class Question009 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 5, 3, 7, 1, 6);

        List<Integer> sortedList = list.stream()
                .sorted() // Natural ascending order
                .collect(Collectors.toList()); //Converts stream to a list

        System.out.println("Sorted list: " + sortedList);
    }
}
