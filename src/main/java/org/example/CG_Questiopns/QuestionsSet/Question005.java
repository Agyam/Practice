package org.example.CG_Questiopns.QuestionsSet;

import java.util.*;
import java.util.stream.*;

public class Question005 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        long count = numbers.stream().count();

        System.out.println("Total elements: " + count);
    }
}
