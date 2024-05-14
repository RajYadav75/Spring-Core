package org.example;

public class PetrolEngine implements Engine{
    public PetrolEngine() {
        System.out.println("Petrol Engine Constructor.....");
    }

    @Override
    public int start() {
        System.out.println("Petrol Engine start.....");
        return 1;
    }
}
