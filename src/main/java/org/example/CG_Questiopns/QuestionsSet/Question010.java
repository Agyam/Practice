package org.example.CG_Questiopns.QuestionsSet;

/**
 * Given a list of integers, sort all the values present in it in descending order using Stream functions?
 */
import java.util.*;
import java.util.stream.*;

public class Question010 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 5, 3, 7, 1, 6);

        List<Integer> sortedDesc = list.stream()
                .sorted(Comparator.reverseOrder()) //// Sorts in descending order
                .collect(Collectors.toList());

        System.out.println("Descending Sorted List: " + sortedDesc);
    }
}
