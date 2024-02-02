
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DataRemoval
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ssi","root","Sagar@2612");
        
        Statement smst=con.createStatement();
        
        smst.executeUpdate("delete from student where rno=2");
        
        con.close();
        
        
        
        
        
    }
    
}
