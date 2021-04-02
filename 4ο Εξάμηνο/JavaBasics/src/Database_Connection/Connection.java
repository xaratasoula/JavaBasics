package Database_Connection;
import java.sql.*;
import java.sql.DriverManager;

public class Connection  implements Provider{
    static java.sql.Connection con = null;
    public static java.sql.Connection getCon(){
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connURL,username,password);
            con.setAutoCommit(true);
            System.out.println("Connection established.");

        }catch (Exception e){
            System.out.println("Connection not established.");
            e.printStackTrace();
        }
        return con;
    }
}
