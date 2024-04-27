import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

// 
// Decompiled by Procyon v0.5.36
// 

public class SQL
{
    Connection con;
    
    public Connection getConnect() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            this.con = DriverManager.getConnection("jdbc:odbc:redlifedsn", "sa", "pass123");
        }
        catch (Exception x) {
            System.out.println(x);
        }
        return this.con;
    }
    
    public int exeUpdate(final String s) {
        int n = 0;
        try {
            this.getConnect().createStatement().executeUpdate(s);
            n = 1;
        }
        catch (Exception x) {
            System.out.println(x);
        }
        return n;
    }
    
    public ResultSet exeQuery(final String s) {
        ResultSet executeQuery = null;
        try {
            executeQuery = this.getConnect().createStatement().executeQuery(s);
        }
        catch (Exception x) {
            System.out.println(x);
        }
        return executeQuery;
    }
}
