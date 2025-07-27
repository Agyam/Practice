package org.example.CG_Questiopns.QuestionsSet;

import java.util.StringJoiner;
/*Explain StringJoiner Class in Java 8? How can we achieve joining multiple Strings using StringJoiner Class?*/
public class Question013 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", "); // StringJoiner use
        sj.add("Java");
        sj.add("Spring");
        sj.add("Docker");

        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("Java");
        sj2.add("Spring");
        sj2.add("Docker");

        System.out.println(sj);  // Output: Java, Spring, Docker
        System.out.println(sj2);  // Output: [Java, Spring, Docker]
    }
}
