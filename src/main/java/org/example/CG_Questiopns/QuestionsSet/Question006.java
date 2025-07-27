package org.example.CG_Questiopns.QuestionsSet;

import java.util.*;
import java.util.stream.*;

public class Question006 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(25, 80, 15, 90, 60);

        int max = numbers.stream()
                .max(Comparator.naturalOrder())
                .get(); // safely use get() if list is not empty

        System.out.println("Maximum element: " + max);
    }
}

