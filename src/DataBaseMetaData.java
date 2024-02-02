
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DatabaseMetaData;

public class DataBaseMetaData {
    public static void main(String[] args)throws Exception {
        Connection con=Utility.connect();
        DatabaseMetaData dbmd=con.getMetaData();
        String product=dbmd.getDatabaseProductName();
        String productVersion=dbmd.getDatabaseProductVersion();
        String driver=dbmd.getDriverName();
        String driverversion=dbmd.getDriverVersion();
        
        System.out.println("Product Name="+product);
        System.out.println("Product Version="+productVersion);
        System.out.println("Driver Name="+driver);
        System.out.println("Driver Version="+driverversion);
        con.close();
        
    }
    
}
