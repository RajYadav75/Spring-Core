package in.rajtech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.rajtech")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig :: constructor");
    }
    @Bean
    public Engine getEngine(){
        Engine engine = new Engine();
        //logic
        return engine;
    }
}
