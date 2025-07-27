package org.example.CG_Questiopns.QuestionsSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
 */
public class Question002 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 21, 33, 144, 155, 60, 1);

        // Filter numbers starting with 1
        List<Integer> startsWithOne = numbers.stream()
                .filter(n -> String.valueOf(n).startsWith("1")) // n is integer, converting to string with String class valueOf() method
                .collect(Collectors.toList());

        System.out.println("Numbers starting with 1: " + startsWithOne);
    }
}
