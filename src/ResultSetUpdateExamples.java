
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ResultSetUpdateExamples {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ssi","root","Sagar@2612");
        Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        
        ResultSet rs=stmt.executeQuery("select * from student");
        
        while(rs.next())
        {
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
        }
        rs.absolute(4);
        //this Update will be save in ResultSet
        rs.updateString(3,"Mech");
        rs.updateInt(4, 7);
        //to to save this update in DataBase 
        rs.updateRow();
        System.out.println("Data Updates Succesfully");
        con.close();
        
        
    }
        
}
