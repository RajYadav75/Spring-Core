package org.example;

public class Car {
    public Car() {
        System.out.println("Car constructor......");
    }

    public Car(Engine engine) {
        System.out.println("Car | 1 arg constructor....");
        this.engine = engine;
    }

    Engine engine;

    public void setEngine(Engine engine) {
        System.out.println("Car setter method");
        this.engine = engine;
    }
    public void drive()
    {
        int res = engine.start();
        if (res>=1)
        {
            System.out.println("Car started.....");
        }
        else
        {
            System.out.println("Engine not started....");
        }
    }
}
