package in.rajtech.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Repository("Dao")
@Repository("oracleDao")
@Primary
public class OracleDBReportDao implements ReportDao{
    @Override
    public void getdata() {
        System.out.println("Getting data from Oracle Database");
    }
}
