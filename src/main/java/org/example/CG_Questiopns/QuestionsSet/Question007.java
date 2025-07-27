package org.example.CG_Questiopns.QuestionsSet;

/**
 * Given a String, find the first non-repeated character in it using Stream functions?
 */
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Question007 {
    public static void main(String[] args) {
        String input = "swiss";

        Optional<Character> firstNonRepeated = input.chars() // IntStream of characters
                .mapToObj(c -> (char) c) // convert int to Character
                .collect(Collectors.groupingBy(
                        Function.identity(),    //a function that returns the same input
                        LinkedHashMap::new, // maintains insertion order
                        Collectors.counting()
                ))
                // now we have LinkedHashMap<Character,Long>

                .entrySet().stream()
                //all key value pairs

                .filter(entry -> entry.getValue() == 1)
                //entry : one key value pair,   entry.getValue(): return value of entry

                .map(Map.Entry::getKey)
                // gives the key of that entry

                .findFirst();

        System.out.println("First non-repeated character: " + firstNonRepeated.orElse(null));
    }


}