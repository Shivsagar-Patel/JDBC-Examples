import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class PSExamples
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Roll no of Student you want to pramote");
        int  n=sc.nextInt();
         String sql="update student set sem=sem+1 where eno=?";
        Connection con=Utility.connect();
       
                
        PreparedStatement ps=con.prepareStatement(sql);
        ps.executeUpdate();
        con.close();
    }

   
}
    
