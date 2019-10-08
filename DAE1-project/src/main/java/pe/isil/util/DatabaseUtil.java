package pe.isil.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String URL = "jdbc:postgresql://tuffi.db.elephantsql.com:5432/efaibmnc";
    private static final String USER = "efaibmnc";
    private static final String PASSWORD = "HS40AuOa05d4wYYBTmXSzWfX0WxONfYb";
    private static final String DRIVER = "org.postgresql.Driver";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
