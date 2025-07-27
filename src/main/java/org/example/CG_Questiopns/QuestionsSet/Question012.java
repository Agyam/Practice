package org.example.CG_Questiopns.QuestionsSet;

import java.util.*;

/**
 * Write a Java 8 program to find the number of Strings in a list whose length is greater than 5?
 */
public class Question012 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Spring", "Docker", "Kafka", "Java", "Microservices");

        long count = list.stream()
                .filter(str -> str.length() > 5)
                .count();

        System.out.println("Strings with length > 5: " + count);
    }
}

