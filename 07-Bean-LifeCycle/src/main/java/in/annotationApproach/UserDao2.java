package in.annotationApproach;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("userdao")
public class UserDao2 implements InitializingBean {
    @PostConstruct
    public void init(){
        System.out.println("Init method");
    }
    public void getData(){
        System.out.println("getting data from database...");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy method");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("get data from db...");
        System.out.println("store data into redis...");
    }

}
