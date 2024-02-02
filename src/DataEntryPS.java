
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class DataEntryPS {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Roll NO");
        int rno=sc.nextInt();
        System.out.println("Enter the Name of Student");
        String name=sc.next();
        System.out.println("Enter the Branch of Student");
        String branch=sc.next();
        
        System.out.println("Enter the Semester of Student");
        int sem=sc.nextInt();
        
        Connection con=Utility.connect();
        
        String sql="insert into student value(?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(sql);
        
        ps.setInt(1, rno);
        ps.setString(2, name);
        ps.setString(3, branch);
        ps.setInt(4, sem);
        
        ps.executeUpdate();
        
        con.close();
        
        
    }
    
}
