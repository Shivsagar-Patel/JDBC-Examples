
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class EmpProjectsList {
    public static void main(String[] args)throws Exception{
      Connection con=Utility.connect();
      String sql="select ename,ptitle from emp,projects where emp.pcode=projects.pcode ";
      Statement stmt=con.createStatement();
   ResultSet rs=   stmt.executeQuery(sql);
   while(rs.next())
   {
       System.out.println(rs.getString(1)+"\t"+rs.getString(2));
   }
      con.close();
      
    }
        //in this  case we do not insert update anything in this table using ResultSet
}
