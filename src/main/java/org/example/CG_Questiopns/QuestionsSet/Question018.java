package org.example.CG_Questiopns.QuestionsSet;

import java.util.*;
import java.util.stream.Collectors;
/*Given a list of Integers, find square of all distinct numbers by using Stream API (list=[9, 10, 3, 4, 7, 3, 4])*/
public class Question018 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

        List<Integer> result = list.stream()
                .distinct()          // Remove duplicates
                .map(n -> n * n)     // Square each number
                .collect(Collectors.toList());

        System.out.println(result); // Output: [81, 100, 9, 16, 49]
    }
}
