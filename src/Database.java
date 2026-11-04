import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static final String URL = "jdbc:sqlite:data/employees.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public static void createTable() {
        String sql = """ 
            CREATE TABLE IF NOT EXISTS employees (
                id VARCHAR(20) PRIMARY KEY,
                username VARCHAR(20) NOT NULL UNIQUE,
                first_name VARCHAR(50) NOT NULL,
                last_name VARCHAR(50) NOT NULL,
                location VARCHAR(20),
                team VARCHAR(50),
                position VARCHAR(100),
                manager_id VARCHAR(20),
                salary DECIMAL(10,2),
                date_of_birth DATE,
                join_date DATE,
                
                FOREIGN KEY (manager_id)
                    REFERENCES employees(id)
                    ON UPDATE CASCADE
                    ON DELETE SET NULL
            );
        """;

        try (
            Connection conn = connect();
            Statement stmt = conn.createStatement()
        ) {
            stmt.execute(sql);
            System.out.println("Employee table ready.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}