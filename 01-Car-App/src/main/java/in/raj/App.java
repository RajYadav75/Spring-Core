package in.raj;

public class App {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        /*
        * -> Car is extending Engine class
            -> Car class can't use inheritance in future
            -> Any changes in Engine class will effect on Car class
            -> Car is tightly coupled with Engine
            Note: It is not recommended to develop classes with Tightly coupling.
        */
    }
}
