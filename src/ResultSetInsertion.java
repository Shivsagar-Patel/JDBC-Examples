
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ResultSetInsertion {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ssi","root","Sagar@2612");
         Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=stmt.executeQuery("select * from student");
        while(rs.next())
        {
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
        }
        //TO Insert a new Row in DataBase Using ResultSet
      /*  rs.moveToInsertRow();
        rs.updateInt(1,7);
        rs.updateString(2,"GGG");
        rs.updateString(3,"CS");
        rs.updateInt(4,6);
        rs.insertRow();
        System.out.println("Insertion Will be Done");*/
        //To Delete a row Using ResultSet
        
        rs.absolute(3);
        rs.deleteRow();
        System.out.println("Row Will be Deleted");
        System.out.println("After Deletion");
        rs.beforeFirst();
         while(rs.next())
        {
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
        }
        
        con.close();
      
          
                
        
      
    }
    
}
