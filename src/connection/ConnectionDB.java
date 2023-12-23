package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ZAFL
 */
public class ConnectionDB {

  public Connection getConnection() {

    Connection conn = null;

    try {
      String db = "pokedex";
      String user = "root";
      String password = "";

      String url = "jdbc:mysql://localhost:3306/" + db;
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(url, user, password);
    } catch (ClassNotFoundException | SQLException ex) {
      System.err.println("Connection error: " + ex.getMessage());
    }

    return conn;
  }
}
