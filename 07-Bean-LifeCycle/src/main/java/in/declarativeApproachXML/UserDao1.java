package in.declarativeApproachXML;

public class UserDao1 {
    public void init(){
        System.out.println("getting db connection....");
    }
    public void getData(){
        System.out.println("getting data from database...");
    }
    public void destroy(){
        System.out.println("closing db connection.....");
    }
}
