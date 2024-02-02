
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class GroupByExample {
    public static void main(String[] args) throws Exception {
        String sql="select desg,sum(sal)from emp group by desg";
        Connection con=Utility.connect();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next())
        {
            System.out.println(rs.getString(1)+"\t"+rs.getString(2));
        }
        con.close();
                
        
        
        
    }
    
}
