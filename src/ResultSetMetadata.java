
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;


public class ResultSetMetadata {
    public static void main(String[] args)throws Exception {
        Connection con=Utility.connect();
        Statement stmt=con.createStatement(); 
        ResultSet rs=stmt.executeQuery("select * from student");
        ResultSetMetaData rsmd=rs.getMetaData();
        int n=rsmd.getColumnCount();
       
        
        
        System.out.println("______________________________________");
         for(int i=1;i<=n;i++)
        {
            System.out.print(rsmd.getColumnName(i)+"\t");
        }
         System.out.println("");
         while(rs.next())
         {
             for(int i=1;i<=n;i++)
             {
                 System.out.print(rs.getString(i)+"\t");
                 
             }
             System.out.println("");
        
            // System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
         }
        System.out.println("______________________________________");
        con.close();
    }

    
}
