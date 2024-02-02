
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class PSEx {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Roll no ypu want to Pramote");
        int n=sc.nextInt();
        
        Connection con=Utility.connect();
        String sql="update student set sem=sem+1 where rno=?";
        PreparedStatement ps=con.prepareStatement(sql);
        
        ps.setInt(1, n);
        ps.executeUpdate();
        con.close();
    }
    
}
