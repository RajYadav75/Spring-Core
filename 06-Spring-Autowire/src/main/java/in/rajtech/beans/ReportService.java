package in.rajtech.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
//    @Autowired
    /*@Qualifier("mysqlDao")*/
    private ReportDao Dao;
    @Autowired
    public ReportService(ReportDao dao) {
        System.out.println("Report service :: Constructor");
        Dao = dao;
    }
    //    @Autowired
//    public void setDao(ReportDao dao){
//        System.out.println("Setter method called....");
//        this.Dao = dao;
//    }

    public void generateReport(){
        Dao.getdata();
        System.out.println("Report Generated.....");
    }
}