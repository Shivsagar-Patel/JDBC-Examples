import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DataEntry {
    public static void main(String[] args) {
        try{
            //step-1 Driver Loading
   Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Succesfully");
            //step-2 Conncetion Establishment
//            String url="jdbc:mysql://localhost:3306/ssi";
//            String userid="root";
//            String password="Sagar@2612";
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ssi","root","Sagar@2612");
            System.out.println("Connection Succesfully");
            
            //step-3 create Statment or PreparedStatement object to  send sql commands
            Statement smst=con.createStatement();
            
            //step-4 write sql command as a string
            
//            String sql="insert into student values(14,'Radhe','CS',6)";
//            String sql="update from student set name='Uday' where rno=14";
//            int n=smst.executeUpdate(sql);
            smst.executeUpdate("insert into student values(1,'AAA','cs',6)");
            smst.executeUpdate("insert into student values(2,'BBB','ec',6)");
            smst.executeUpdate("insert into student values(3,'CCC','cs',5)");
            smst.executeUpdate("insert into student values(4,'DDD','civil',6)");
            smst.executeUpdate("insert into student values(5,'EEE','ec',7)");
          //  System.out.println(n+"Rows are added");
            
            //step-5
            con.close();
            
            
        }
        catch(Exception e){}
    
}
            
    
    
}
