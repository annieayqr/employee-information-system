import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
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
    
    public enum Operator {
        EQUAL("="),
        NOT_EQUAL("!="),
        GREATER(">"),
        LESS("<"),
        GREATER_EQUAL(">="),
        LESS_EQUAL("<=");

        private final String symbol;

        Operator(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }
    }
    
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

    public static Employee view(String id) {
        String sql = "SELECT * FROM employees WHERE id = ?";
        
        try (
            Connection conn = Database.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, id);

            ResultSet result = stmt.executeQuery();

            if (result.next()) {
                return new Employee(
                    result.getString("id"),
                    result.getString("username"),
                    result.getString("first_name"),
                    result.getString("last_name"),
                    result.getString("location"),
                    result.getString("team"),
                    result.getString("position"),
                    result.getString("manager_id"),
                    result.getDouble("salary"),
                    result.getString("date_of_birth"),
                    result.getString("join_date")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error viewing employee: " + e.getMessage());
        }

        return null;
    }
    
    public static List<Employee> viewAll() {}

    public static void update(String id, Field field, String value) {}

    public static void delete(String id) {}

    public static void sort(Field field, Order order) {}

    public static void filter(Field field, Operator operator, String value) {}
}
