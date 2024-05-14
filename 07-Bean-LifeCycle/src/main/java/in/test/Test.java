package in.test;


import in.programmingApproach.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        UserDao dao = applicationContext.getBean(UserDao.class);
        dao.getData();
        // Down code is for closing IOC Container-
        ConfigurableApplicationContext configurableApplicationContext =
                (ConfigurableApplicationContext) applicationContext;
        configurableApplicationContext.close();
    }
}
