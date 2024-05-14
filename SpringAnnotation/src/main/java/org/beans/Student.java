package org.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{
    @Value("Raj Yadav")
    private String name;
    @Value("101")
    private int rollNo;
    @Value("94.23f")
    private float marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll : "+rollNo);
        System.out.println("Marks : "+marks);
    }
}
