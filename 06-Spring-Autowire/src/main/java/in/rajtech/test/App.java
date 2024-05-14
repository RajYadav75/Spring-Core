package in.rajtech.test;

import in.rajtech.AppConfig;
import in.rajtech.beans.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ReportService service = context.getBean(ReportService.class);
        service.generateReport();
    }
}