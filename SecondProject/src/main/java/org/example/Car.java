package org.example;

public class Car
{
    Engine engine;
    Car()
    {
        System.out.println("Car constructor...");
    }

    public void setEngine(Engine engine) {
        System.out.println("Car Setter method.....");
        this.engine = engine;
    }

    public void drive()
    {
        int res = engine.start();
        if (res>=1){
            System.out.println("Car started with good engine");
        }
        else{
            System.out.println("Engine not working......");
        }
    }
}
