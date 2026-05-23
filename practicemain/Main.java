
package com.mycompany.practicemain;


public class Main {
    
    public static void main (String [] args) {
        
        Animal animal = new Animal("Danger Animal", "Huge", 400);
        doAnimalStaff(animal, "fast");
        
        Dog dog = new Dog();
        doAnimalStaff(dog, "slow");
        
        Dog yorkie = new Dog("yorkie", 15);
        doAnimalStaff(yorkie, "fast");
        Dog retriever = new Dog("Lab", 65, "Floppy", "Swimmer");
        doAnimalStaff(retriever, "slow");
        
        Dog wolf = new Dog("Wolf", 40);
        doAnimalStaff (wolf, "slow");
        
        Fish goldF = new Fish (2, 3, "Goldfish", 0.25);
        doAnimalStaff(goldF, "fast");
        
    }
    
    public static void doAnimalStaff(Animal animal, String speed){
        
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("------------------------");
    }
    
}
