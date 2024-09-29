import java.sql.Connection;

public class SingletonTest {

    public static void main(String[] args) {

        // Fetching the first instance of MySQLConnection
        MySQLConnection dbConnection1 = MySQLConnection.getInstance();
        Connection connection1 = dbConnection1.getConnection();

        // Fetching the second instance of MySQLConnection
        MySQLConnection dbConnection2 = MySQLConnection.getInstance();
        Connection connection2 = dbConnection2.getConnection();

        System.out.println();

        // Testing if both instances are the same
        if (dbConnection1 == dbConnection2) {
            System.out.println("Both dbConnection1 and dbConnection2 are the same instance.");
        } else {
            System.out.println("dbConnection1 and dbConnection2 are different instances.");
        }

        // Testing if both connections are the same
        if (connection1 == connection2) {
            System.out.println("Both connection1 and connection2 are the same connection.");
        } else {
            System.out.println("connection1 and connection2 are different connections.");
        }

        // Fetching data using the first instance
        System.out.println("Fetching data from the database using First instance:");
        dbConnection1.fetchData();

        System.out.println();

        // Fetching data using the second instance
        System.out.println("Fetching data from the database using Second instance:");
        dbConnection2.fetchData();
    }
}
