package org.example.CG_Questiopns.QuestionsSet;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find the Word/number got repeated by using Stream API (input: 2,3,34,5,5,4,3,3,3 → output: 2-1,3-4,34-1,5-2,4-1)
 */
public class Question014 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(2, 3, 34, 5, 5, 4, 3, 3, 3);

        Map<Integer, Long> freqMap = input.stream()
                .collect(Collectors.groupingBy(
                Function.identity(),           // Group by the element itself
                Collectors.counting()          // Count the occurrences
        ));

        freqMap.forEach((k, v) -> System.out.println(k + "-" + v));
    }
}
