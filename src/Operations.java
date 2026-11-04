import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Operations {

    public enum Field {
        ID,
        USERNAME,
        FIRST_NAME,
        LAST_NAME,
        LOCATION,
        TEAM,
        POSITION,
        MANAGER_ID,
        SALARY,
        DATE_OF_BIRTH,
        JOIN_DATE
    }

    public enum Order { ASC, DESC }
    
    public static void insert(Employee employee) {

        String sql = """
            INSERT INTO employees (
                id,
                username,
                first_name,
                last_name,
                location,
                team,
                position,
                manager_id,
                salary,
                date_of_birth,
                join_date
            ) 
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
        """;

        try (
            Connection conn = Database.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, employee.getID());
            stmt.setString(2, employee.getUsername());
            stmt.setString(3, employee.getFirstName());
            stmt.setString(4, employee.getLastName());
            stmt.setString(5, employee.getLocation());
            stmt.setString(6, employee.getTeam());
            stmt.setString(7, employee.getPosition());
            stmt.setString(8, employee.getManagerID());
            stmt.setDouble(9, employee.getSalary());
            stmt.setString(10, employee.getDateOfBirth());
            stmt.setString(11, employee.getJoinDate());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error inseting employee: " + e.getMessage());
        }
    }

    public static Employee view(String id) {}
    
    public static List<Employee> viewAll() {}

    public static void update(String id, Field field, String value) {}

    public static void delete(String id) {}

    public static void sort(Field field, Order order) {}
}
