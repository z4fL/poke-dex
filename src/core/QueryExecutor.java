package core;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connection.ConnectionDB;

/**
 *
 * @author ZAFL
 */
public class QueryExecutor {

  Connection conn;
  ConnectionDB connDB = new ConnectionDB();
  ResultSet res;
  Statement stmt;

  // SELECT
  public ResultSet querySelect(String query) {
    try {
      conn = connDB.getConnection();
      stmt = conn.createStatement();
      res = stmt.executeQuery(query);
    } catch (SQLException ex) {
      System.err.println("Error in querySelect(): " + ex.getMessage());
    }

    return res;
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

  public void closeConn() {
    try {
      conn.close();
    } catch (SQLException ex) {
      System.err.println("Error in closeConn: " + ex.getMessage());
    }
  }
}
