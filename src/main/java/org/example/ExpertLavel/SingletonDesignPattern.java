package org.example.ExpertLavel;

public class SingletonDesignPattern {

    private static SingletonDesignPattern singletonObject ;

    private SingletonDesignPattern() {
        System.out.println("Constructer called");
    }

    public static SingletonDesignPattern singletonDesignPatternObject(){
        if(singletonObject==null){
            singletonObject= new SingletonDesignPattern();
        }
        return singletonObject;
    }

    public static void main(String[] args) {
        SingletonDesignPattern s1 = SingletonDesignPattern.singletonDesignPatternObject();
        SingletonDesignPattern s2 = SingletonDesignPattern.singletonDesignPatternObject();
        System.out.println(s2==s1);
        System.out.println(s1!=s2);
    }

}
