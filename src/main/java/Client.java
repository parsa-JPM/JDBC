
import java.sql.*;

public class Client {
    public static void main(String[] args) throws SQLException {
        readData();
    }


    private static void readData() throws SQLException {
        //connection info
        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String uname = "root";
        String pass = "";

        //Establish connection
        Connection con = DriverManager.getConnection(url, uname, pass);

        Statement statement = con.createStatement();
        //write your query to fetch
        ResultSet rs = statement.executeQuery("select * from `parsa`");
        //Read data
        rs.next();
        String name = rs.getString("name");
        System.out.println(name);
    }
}
