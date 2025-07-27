package org.example.ExpertLavel.FactoryDesignPatter;

public class Main {
    public static void main(String[] args) {
//        AnimalFactory af = new AnimalFactory();
//        System.out.println(af.getAnimal("cat"));
//        System.out.println(af.getAnimal("dog"));
//        System.out.println(af.getAnimal("lion"));

        try{
                System.out.println("Arithmatic Exception Expected");
            int i=10/0;
            System.out.println("Ricon ");
            System.out.println(i);
        }catch (Exception e){
            System.out.println("Arithmatic Exception");
            e.printStackTrace();
        }
        System.out.println("Java ");

    }
}
