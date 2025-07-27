package org.example.CG_Questiopns.QuestionsSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*Given a list of Strings, convert each String to uppercase and join them with comma (,) using Stream API (List=["USA", "Japan", "France", ...])*/
public class Question017 {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("USA", "Japan", "France", "India");

        String result = countries.stream()
                .map(String::toUpperCase)        // Convert String to uppercase String
                .collect(Collectors.joining(",")); // Join with commas

        System.out.println(result); // Output: USA,JAPAN,FRANCE,INDIA
    }
}
