import org.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Student studentmethod()
    {
        Student std = new Student();

        std.setName("Raj Yadav");
        std.setRoll(07);
        std.setEmail("rajyadav@gmail.com");

        return std;
    }
}