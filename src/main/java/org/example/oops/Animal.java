package org.example.oops;

public class Animal {
    void makeSound(){
        System.out.println("Animal Make Sound");
    }

    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.makeSound();

        a = new Cat();
        a.makeSound();
    }

}
