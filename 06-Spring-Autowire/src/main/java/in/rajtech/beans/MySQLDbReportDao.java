package in.rajtech.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
/*@Primary*/
public class MySQLDbReportDao implements ReportDao{
    @Override
    public void getdata() {
        System.out.println("Getting data from MySQL Database");
    }
}