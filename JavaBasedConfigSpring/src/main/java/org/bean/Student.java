package org.bean;

public class Student {
    private String name;
    private int roll;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getEmail() {
        return email;
    }

    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("ROll : "+roll);
        System.out.println("Email : "+email);
    }
}
