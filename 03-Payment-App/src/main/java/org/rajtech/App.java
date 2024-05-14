package org.rajtech;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("Beans.xml");
        PaymentService service = applicationContext.getBean(PaymentService.class);
        service.doPayment(199.00);  // here null pointer exception without beans.xml setup
    }
}
