package org.example;

public class DeiselEngine implements Engine{
    @Override
    public int start() {
        System.out.println("Diesel Engine Start...");
        return 1;
    }
}
