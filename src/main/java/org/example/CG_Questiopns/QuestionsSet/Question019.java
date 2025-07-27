package org.example.CG_Questiopns.QuestionsSet;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
//Given a list of Integers, find total count, min, max, sum, and average using Stream API (input: [2, 3, 5, ...])
public class Question019 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 7, 9, 3);

        IntSummaryStatistics stats = list.stream()

                .mapToInt(Integer::intValue)
//              Converts Stream<Integer> to IntStream

                .summaryStatistics();
//              Gathers all stats in one shot

        System.out.println("Count: " + stats.getCount());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
    }
}
