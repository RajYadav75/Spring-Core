package in.raj;

import in.raj.dto.Person;
import in.raj.dto.User;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setPersonId(101);
        System.out.println(p);


        User u = new User();
        u.setUsername("Raj Yadav");
        u.setEmail("Rajyadav@gmail.com");
        u.setPwd("Bhagwan");
        u.setGender("Male");
        u.setPhno(Long.valueOf(78932922));
        u.setUserid(7);
        System.out.println(u);

    }
}
