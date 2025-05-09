import java.sql.*;

public class JDBCCRUD {
    // Database connection details
    static final String DB_URL = "jdbc:mysql://localhost:3306/your_database";
    static final String USER = "your_username";
    static final String PASS = "your_password";

    public static void main(String[] args) {
        createEmployee("Alice", "Engineer");
        readEmployees();
        updateEmployee(1, "Senior Engineer");
        deleteEmployee(1);
    }

    // CREATE
    public static void createEmployee(String name, String role) {
        String sql = "INSERT INTO employees (name, role) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, role);
            pstmt.executeUpdate();
            System.out.println("Employee added.");
        } catch (SQLException e) {
            ;
        }
    }

    // READ
    public static void readEmployees() {
        String sql = "SELECT * FROM employees";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String role = rs.getString("role");
                System.out.printf("ID: %d, Name: %s, Role: %s%n", id, name, role);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public static void updateEmployee(int id, String newRole) {
        String sql = "UPDATE employees SET role = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, newRole);
            pstmt.setInt(2, id);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Updated rows: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public static void deleteEmployee(int id) {
        String sql = "DELETE FROM employees WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Deleted rows: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
