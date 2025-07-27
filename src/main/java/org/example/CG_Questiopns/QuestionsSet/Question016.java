package org.example.CG_Questiopns.QuestionsSet;


/**
 * How Lambda Expression and Functional Interfaces are Related?
 */
public class Question016 {
    public static void main(String[] args) {
        MyFunctionalInterface obj = () -> System.out.println("Hello using Lambda!");
        obj.sayHello();
    }
}
