package org.example.CG_Questiopns.QuestionsSet;


/**
 * Q20 Given list input: ["Himanshu", "Devraj12", "rajeesh", "pavan", "sachine"], create Map output: {5=[pavan], 7=[rajeesh, sachine], 8=[Himanshu, Devraj12]}
 */

import java.util.*;
import java.util.stream.*;
public class Question020 {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Himanshu", "Devraj12", "rajeesh", "pavan", "sachine");

            Map<Integer, List<String>> groupedByLength = names.stream()
                    .collect(Collectors.groupingBy(String::length));   //Collector that groups items by a classifier length

            System.out.println(groupedByLength);
        }
    }
// if input:    List<String> names = Arrays.asList("Ram", "Shyam", "Radha", "Mohan");
//output:       {3=[Ram], 5=[Radha, Mohan], 5=[Shyam]}