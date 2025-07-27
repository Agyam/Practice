package org.example.CG_Questiopns.QuestionsSet;
/**
 * Q21 Given String str="telCo", toggle it to str=TELcO.
 */
import java.util.stream.Collectors;

public class Question021 {
    public static void main(String[] args) {
        String str = "telCo";

        String toggled = str.chars()
                .mapToObj(c -> Character.isUpperCase(c) ? Character.toLowerCase((char)c) : Character.toUpperCase((char)c))
                // use of ternary operator, lambdas expression,
                // change each capital character to small and smalls to capital and return in integer

                .map(String::valueOf)
//                Converts int to String (e.g., 1 → "1")

                .collect(Collectors.joining());
//                collect and concat characters to string

        System.out.println(toggled);
    }
}
