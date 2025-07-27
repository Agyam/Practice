package org.example.CG_Questiopns.QuestionsSet;

/**
 * Given a String, find the first repeated character in it using Stream functions?
 */
import java.util.*;
import java.util.stream.*;

public class Question008 {
    public static void main(String[] args) {
        String input = "programming";

        Set<Character> seen = new HashSet<>();

        Optional<Character> firstRepeated = input.chars() // IntStream of characters,  Returns IntStream of character codes (ASCII)
                .mapToObj(c -> (char) c)    //Converts each int to Character object
                .filter(c -> !seen.add(c)) // add() returns false if already exists
                .findFirst();

        System.out.println("First repeated character: " + firstRepeated.orElse(null));
    }
}

