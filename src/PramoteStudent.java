
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class PramoteStudent {
    public static void main(String[] args)throws Exception {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ssi","root", "Sagar@2612");
        Connection con=Utility.connect();
        Statement smst=con.createStatement();
        
        smst.executeUpdate("update student set sem=sem+1");
         // smst.executeUpdate("update student set rno=rno+1");
        con.close();
        
    }
    
}
