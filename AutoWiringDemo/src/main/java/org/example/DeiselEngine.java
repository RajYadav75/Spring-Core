package org.example;

public class DeiselEngine implements Engine{
    public DeiselEngine() {
        System.out.println("DeiselEngine cons............");
    }

    @Override
    public int start() {
        System.out.println("Diesel Engine Start...");
        return 1;
    }
}
