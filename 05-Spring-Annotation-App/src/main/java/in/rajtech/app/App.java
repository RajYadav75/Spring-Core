package in.rajtech.app;

import in.rajtech.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        /*ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("");*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    }
}
