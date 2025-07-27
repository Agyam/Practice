package org.example.CG_Questiopns;

public class Main {
    public static void main(String[] args) {
        SingletonObjectDemo singleton1=SingletonObjectDemo.getInstance();
        SingletonObjectDemo singleton2=SingletonObjectDemo.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);

    }
}
