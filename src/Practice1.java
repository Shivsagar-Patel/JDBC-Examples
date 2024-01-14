
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;


public class Practice1 {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
                
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ssi","root","Sagar@2612");
         Statement stmt=con.createStatement();
         String sql="select * from student";
         ResultSet rs=stmt.executeQuery(sql);
         ResultSetMetaData rsmd=rs.getMetaData();
         int n =rsmd.getColumnCount();
         for(int i=1;i<=n;i++)
         {
             System.out.print(rsmd.getColumnName(i)+"\t");
         }
         System.out.println("");
          while(rs.next()){
              for(int i=1;i<=n;i++)
        {
            System.out.print(rs.getString(i)+"\t");    
        }
             System.out.println("");
         }
        
                 
//         rs.absolute(6);
//         rs.updateString(3, "CS");
//         rs.updateRow();
//         rs.beforeFirst()
//           rs.moveToInsertRow();
//           rs.updateInt(1,10);
//           rs.updateString(2,"Sagar");
//           rs.updateString(3,"AI");
//           rs.updateInt(4,7);
//           rs.insertRow();
//           
//           rs.absolute(10);
//           rs.deleteRow();
//           rs.beforeFirst();
       
      //  System.out.println("Rows are Inserted");
        con.close();
               
//        System.out.println("Enter the rno of Student");
//        int n=sc.nextInt();
//         System.out.println("Enter the Nameof Student");
//        String name=sc.next();
//         System.out.println("Enter the branch of Student");
//      String branch=sc.next();
//         System.out.println("Enter the semester of Student");
//        int sem=sc.nextInt();
     /*   PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
         ps.setInt(1,n);
         ps.setString(2,name);
         ps.setString(3,branch);
         ps.setInt(4,7);
         ps.executeUpdate();*/
        
        
                
       
    }
            
    
}
