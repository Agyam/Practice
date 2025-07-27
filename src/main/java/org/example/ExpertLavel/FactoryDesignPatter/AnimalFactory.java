package org.example.ExpertLavel.FactoryDesignPatter;

public class AnimalFactory {

    public Animal getAnimal(String type){
        if(type.equalsIgnoreCase("null")){
            return null;
        }
        if(type.equalsIgnoreCase("Dog")){
            return new Dog();
        }
        if(type.equalsIgnoreCase("Cat")){
            return new Cat();
        }
        return null;
    }
}
