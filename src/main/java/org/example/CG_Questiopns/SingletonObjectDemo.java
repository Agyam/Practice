package org.example.CG_Questiopns;

public class SingletonObjectDemo {
    private static SingletonObjectDemo singletonObjectDemo;

   private SingletonObjectDemo(){
       System.out.println(" singleton object initialize ");
   }

    public static SingletonObjectDemo getInstance(){
       if(singletonObjectDemo==null){
           singletonObjectDemo=new SingletonObjectDemo();
       }
       return singletonObjectDemo;
   }

}