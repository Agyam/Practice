package org.example.CG_Questiopns.QuestionsSet;

/**
 * Write a Java Lambda Expression to Create a Thread
 */
public class Question015 {
    public static void main(String[] args) {
        // Creating a thread using lambda expression
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running using Lambda!");
        });

        thread.start(); // Start the thread
    }
}
