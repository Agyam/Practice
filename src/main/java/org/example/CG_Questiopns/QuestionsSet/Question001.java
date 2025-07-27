package org.example.CG_Questiopns.QuestionsSet;

import java.util.*;
import java.util.stream.Collectors;

public class Question001 {
    // EvenNumberStream
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 44, 55, 60);

        // Stream to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)   // keep only even
                .collect(Collectors.toList()); // Converts stream to a list

        System.out.println("Even Numbers: " + evenNumbers);//print the list
    }
}
