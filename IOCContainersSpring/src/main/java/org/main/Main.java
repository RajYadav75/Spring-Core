package org.main;

import org.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stdid1 = (Student) applicationContext.getBean("stdid1");
        stdid1.display();

        System.out.println("=========>>>>>>>>>>=================");

        Student stdid2 = (Student) applicationContext.getBean("stdid2");
        stdid2.display();


        System.out.println("=========>>>>>>>>>>=================");


        Student stdid3 = (Student) applicationContext.getBean("stdid3");
        stdid3.display();


        System.out.println("=========>>>>>>>>>>=================");

        Student stdid4 = (Student) applicationContext.getBean("stdid4");
        stdid4.display();
    }
}
