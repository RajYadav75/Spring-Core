package org.beans;

public class Student
{
    private String name;
    private int roll;
    private Address address;

    public void setName(String name) {
        System.out.println("Setter method name");
        this.name = name;
    }

    public void setAddress(Address address) {
        System.out.println("Setter method address");
        this.address = address;
    }

    public void setRoll(int roll) {
        System.out.println("Setter method roll");
        this.roll = roll;
    }


    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
        System.out.println("Address : "+address);
    }
}
