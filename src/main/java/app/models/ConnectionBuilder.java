package app.models;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBuilder {
    ExternalProperties EP = new ExternalProperties();

    public Connection getConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://db.taehub.me:3306/aglie_9pay9?useSSL=false", "paymaster" , "Mypay.123");
    }
}
