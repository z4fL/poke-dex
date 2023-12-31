package core;

import connection.MySQLConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ZAFL
 */
public class QueryExecutor {

  Connection conn;
  MySQLConnection connDB = new MySQLConnection();
  Statement stmt;
  ResultSet res;

  // SELECT
  public List<Map<String, Object>> querySelect(String query) throws SQLException {
    List<Map<String, Object>> list = new ArrayList<>();
    try {
      conn = connDB.getConnection();
      stmt = conn.createStatement();
      res = stmt.executeQuery(query);

      ResultSetMetaData md = res.getMetaData();
      int columns = md.getColumnCount();

      while (res.next()) {
        Map<String, Object> row = new HashMap<>(columns);
        for (int i = 1; i <= columns; ++i) {
          row.put(md.getColumnName(i), res.getObject(i));
        }
        list.add(row);
      }

    } catch (SQLException ex) {
      System.err.println("Error in querySelect(): " + ex.getMessage());
    } finally {
      conn.close();
    }

    return list;
  }

  // INSERT, UPDATE, or DELETE
  public int queryIUD(String query) throws SQLException {
    int baris = 0; // baris yang terpengaruh
    try {
      conn = connDB.getConnection();
      stmt = conn.createStatement();
      baris = stmt.executeUpdate(query);

    } catch (SQLException ex) {
      System.err.println("Error in queryIUD: " + ex.getMessage());
    } finally {
      conn.close();
    }

    return baris;
  }

}
