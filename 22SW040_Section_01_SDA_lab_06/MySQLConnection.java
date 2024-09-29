import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnection {

    // Making Single instance
    private static MySQLConnection instance;


    private Connection connection;

    // Defining the database credentials
    private final String url = "jdbc:mysql://localhost:3306/sda_lab";
    private final String user = "root";
    private final String password = "farooquesajjad";


    // Making Constructor private for Singleton Pattern
    private MySQLConnection() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println();
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }

    // Static method to get singleton instance
    public static MySQLConnection getInstance() {
        if (instance == null) {
            instance = new MySQLConnection(); // Lazy initialization
        }
        return instance;
    }

    // will return the connection obj
    public Connection getConnection() {
        return connection;
    }

   // Fetching Data From sda_lab_06 table form MYSQL work bench
    public void fetchData() {
        // query for retrieving the data
        String query = "SELECT * FROM sda_lab_06"; // table name

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {


            while (rs.next()) {
                int id = rs.getInt("stu_id");
                String name = rs.getString("stu_name");
                int marks = rs.getInt("stu_marks");
                String date = rs.getString("test_date");
                System.out.println();
                System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Date: " + date);
            }

        } catch (SQLException e) {
            System.out.println("Error retrieving data.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        MySQLConnection dbConnection = MySQLConnection.getInstance();
        Connection conn = dbConnection.getConnection();


        if (conn != null) {
            System.out.println("Connection is ready for use!");
            dbConnection.fetchData();  // Calling the method to fetch and display data
        } else {
            System.out.println("Failed to establish connection.");
        }
    }
}
