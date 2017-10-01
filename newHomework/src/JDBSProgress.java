import org.h2.jdbcx.JdbcDataSource;

import java.sql.*;

public class JDBSProgress {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setURL("jdbc:h2:~/test2");
        dataSource.setUser("sa");
        dataSource.setPassword("");
        Class.forName("org.h2.Driver");
        String sql = "CREATE TABLE Progress" +
                "( student_id integer primary key auto_increment, " +
                " physics INTEGER , " +
                " programming INTEGER , " +
                " math INTEGER)";
        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

            String sql1 = "INSERT INTO Progress " + "VALUES (100100, '4', '5', '3')";
            statement.executeUpdate(sql1);
            String sql2 = "INSERT INTO Progress " + "VALUES (101101, '5', '2', '3')";
            statement.executeUpdate(sql2);
            String sql3 = "INSERT INTO Progress " + "VALUES (102102, '5', '4', '4')";
            statement.executeUpdate(sql3);
            String sql4 = "INSERT INTO Progress " + "VALUES (103103, '3', '3', '2')";
            statement.executeUpdate(sql4);
           String Math = " WHERE MATH=3";
            System.out.println("MATH = 3");
            prinrer(statement, Math);

            String PhysicsAndProgramming = " WHERE physics > programming";
            System.out.println("physics > programming");
            prinrer(statement, PhysicsAndProgramming);
        }
    }

    private static void prinrer(Statement statement, String WHERE) throws SQLException {
        String query = "SELECT student_id, physics, programming, math FROM Progress" + WHERE;
        System.out.println();
        ResultSet rs = statement.executeQuery(query);

        while(rs.next()){
            int id  = rs.getInt("student_id");
            int physics = rs.getInt("physics");
            int programming = rs.getInt("programming");
            int math = rs.getInt("math");
            System.out.print("ID: " + id);
            System.out.print(", physics: " + physics);
            System.out.print(", programming: " + programming);
            System.out.println(", math: " + math);
            System.out.println();
        }
        rs.close();
    }
}