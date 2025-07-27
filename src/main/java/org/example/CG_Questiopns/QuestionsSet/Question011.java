package org.example.CG_Questiopns.QuestionsSet;

/**
 *
 Q11) Write a Java 8 program to concatenate two Streams?
 */
import java.util.*;
import java.util.stream.*;

public class Question011 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "Spring");
        List<String> list2 = Arrays.asList("Docker", "Kafka");

        Stream<String> combined = Stream.concat(list1.stream(), list2.stream());

        List<String> result = combined.collect(Collectors.toList());

        System.out.println("Concatenated Stream: " + result);
    }
}

