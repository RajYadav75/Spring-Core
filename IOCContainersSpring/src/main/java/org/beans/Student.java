package org.beans;

public class Student {
    private String  studentName;
    private int studentRoll;
    private String studentEmail;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public void display()
    {
        System.out.println("Name is : "+studentName);
        System.out.println("Roll Number is : "+studentRoll);
        System.out.println("Email is : "+studentEmail);
    }
}
