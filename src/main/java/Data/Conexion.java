package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;


public class Conexion {
    private static final String JBDC_URL = "jdbc:mysql://localhost:3306/duendefeliz?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "12345678";

    private static BasicDataSource datasource;

    public static DataSource getDataSource() {
        if(datasource == null) {
            datasource = new BasicDataSource();
            datasource.setUrl(JBDC_URL);
            datasource.setUsername(JDBC_USER);
            datasource.setPassword(JDBC_PASSWORD);
            datasource.setInitialSize(50);
        }

        return datasource;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
