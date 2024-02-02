
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ResultSetExampleTwo {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ssi","root","Sagar@2612");
         Statement stmt=con.createStatement();
        // String sql="select * from student where branch='ec'";
           String sql="select * from student";
          ResultSet rs=stmt.executeQuery(sql);
         //Cursor Movement from BeforeFirst postion to AfterLast Postion 
        // rs.next();
          while(rs.next())
          {
              System.out.println(rs.getString(1));
          }
          rs.beforeFirst();
          while(rs.next())
          {
              System.out.println(rs.getString(2));
          }
          rs.absolute(3);
          System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
           
         con.close();
         
        
        
    }
    
}
