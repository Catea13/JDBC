import java.sql.*;

public class Delete {
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "login1", "pwd1");
    Statement stmt = con.createStatement();

    String q1 = "select * from cafe WHERE order = 'cafe'";


    // Deleting from database
    String q2 = "DELETE from cafe WHERE order= 'cofe'";
    String q3="UPDATE Orders"+
            "SET OrderName = 'Pizza'"+
            "WHERE CustomerID = 1;";

    String q4 = "INSERT INTO orders " +
            "VALUES (cofe, pizza)";

    ResultSet rs = stmt.executeQuery(q1);
    ResultSet rs2 = stmt.executeQuery(q2);
    ResultSet rs3= stmt.executeQuery(q3);
    ResultSet rs4=stmt.executeQuery(q4);


    public Delete() throws SQLException {
    }
}



