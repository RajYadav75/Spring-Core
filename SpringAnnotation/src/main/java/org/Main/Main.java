package org.Main;

import org.beans.Student;
import org.resources.SpringConfigure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
        * Here is xml part configuration
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student std =(Student) context.getBean("student");
        std.display();

        /*
         * Here is java part configuration
         */
    /*ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigure.class);
    Student std = (Student) context.getBean("student");
    std.display();*/
    }
}
