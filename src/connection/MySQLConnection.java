package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ZAFL
 */
public class MySQLConnection {

  public Connection getConnection() {
    Connection conn = null;
    try {
      String url = "jdbc:mysql://localhost:3306/";
      String database = "pokedex";
      String user = "root";
      String password = "";

      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(
          url + database,
          user,
          password
      );
    } catch (ClassNotFoundException | SQLException e) {
      System.err.println("Error in connection: " + e.getMessage());
      return null;
    }

    return conn;
  }
}
