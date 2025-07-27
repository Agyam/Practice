package org.example.CG_Questiopns.QuestionsSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Q3 How to find duplicate elements in a given integers list in java using Stream functions?
public class Question003 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 10, 50, 20, 60, 70);

        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n)) // if add() returns false, it's a duplicate
                .collect(Collectors.toList());

        System.out.println("Duplicate elements: " + duplicates);
    }
}
