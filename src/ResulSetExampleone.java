
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ResulSetExampleone {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ssi","root","Sagar@2612");
         Statement stmt=con.createStatement();
        // String sql="select * from student where branch='ec'";
           String sql="select name,rno,branch from student";
          ResultSet rs=stmt.executeQuery(sql);
         //Cursor Movement from BeforeFirst postion to AfterLast Postion 
        // rs.next();
         while(rs.next())
         {
            // boolean b=rs.next();
          //   if(b==false)break;
           
         String s1=rs.getString(1);//rs.getString("rno");
         String s2=rs.getString(2);//rs.getString("name");
         String s3=rs.getString(3);//rs.getString("branch");
        // String s4=rs.getString(4);//rs.getString("sem");
         System.out.println(s1+","+s2+","+s3);
         }
         con.close();
         
        
        
    }
            
    
}
