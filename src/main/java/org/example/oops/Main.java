package org.example.oops;

public class Main {

    public static void main(String[] args) {
        Flyable f=new Bird();
        Flyable f1 = new Aeroplane();
        f.fly();
        f1.fly();
    }
}
