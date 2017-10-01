import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBShome {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setURL("jdbc:h2:~/test1");
        dataSource.setUser("sa");
        dataSource.setPassword("");
        Class.forName("org.h2.Driver");
        String sql = "CREATE TABLE Students " +
                "( ID INT PRIMARY KEY, " +
                " firstname VARCHAR(255), " +
                " lastname VARCHAR(255))";

        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            String sql1 = "INSERT INTO Students " + "VALUES (100100, 'Zara', 'Ali')";

            statement.executeUpdate(sql1);
            sql1 = "INSERT INTO Students " + "VALUES (101101, 'Mahnaz', 'Fatma')";

            statement.executeUpdate(sql1);
            sql1 = "INSERT INTO Students " + "VALUES (102102, 'Zaid', 'Khan')";

            statement.executeUpdate(sql1);
            sql1 = "INSERT INTO Students " + "VALUES(103103, 'Sumit', 'Mittal')";
            statement.executeUpdate(sql1);
            String sql2 = "SELECT id, firstname, lastname FROM Students";
            ResultSet rs = statement.executeQuery(sql2);

            while (rs.next()) {

                int id = rs.getInt("id");
                String first = rs.getString("firstname");
                String last = rs.getString("lastname");

                System.out.print("ID: " + id);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }
        }
    }
}
