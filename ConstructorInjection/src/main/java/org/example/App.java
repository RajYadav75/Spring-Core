package org.example;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App
{
    public static void main( String[] args )
    {
            ApplicationContext applicationContext =
               new ClassPathXmlApplicationContext("Beans.xml");
            Car car1 = applicationContext.getBean(Car.class);//ctrl+alt+v
            Car car2 = applicationContext.getBean(Car.class);
//          car.drive();
            System.out.println(car1.hashCode());
             System.out.println(car2.hashCode());
        /*BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        Car car = factory.getBean(Car.class);*/
    }
}