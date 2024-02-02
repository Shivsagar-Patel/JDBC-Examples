
import java.sql.Connection;
import java.sql.Statement;

public class DDLExamples {
    public static void main(String[] args)throws Exception {
   Connection con=Utility.connect();
   Statement smst=con.createStatement();
   
 //  smst.executeUpdate("create table sagar (code integer,name varchar(50))");
   smst.executeUpdate("drop table sagar");
   con.close();
   
}
    
}
