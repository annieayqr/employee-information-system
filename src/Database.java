import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String URL = "jdbc:sqlite:data/employees.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public static void createTable() {
        String sql = """ 
            CREATE TABLE IF NOT EXISTS employees (
                id VANCHAR(20) PRIMARY KEY,
                username VANCHAR(20) NOT NULL UNIQUE
                first_name VANCHAR(50) NOT NULL,
                last_name VANCHAR(50) NOT NULL,
                date_of_birth DATE,
                join_date DATE,
                location VANCHAR(20)
                team VANCHAR(50),
                position VANCHAR(100),
                salary DECIMAL(10,2)
                manager_id VARCHAR(20),
                
                FOREIGN KEY (manager_id) REFERENCES employees(id)
            );
        """;
    }
}