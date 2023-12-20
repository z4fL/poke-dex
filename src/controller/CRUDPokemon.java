package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Pokemon;

/**
 *
 * @author ZAFL
 */
public class CRUDPokemon {

  QueryExecutor qe;
  int affectedRows;

  // Create
  public int tambah(Pokemon pokemon) {
    String query = "INSERT INTO `pokemon`(`id`, `pokedex_id`, `nama`, `tinggi`, `berat`) "
            + "VALUES ("
            + "'" + pokemon.getId() + "',"
            + "'" + pokemon.getPokedex_id() + "',"
            + "'" + pokemon.getNama() + "',"
            + "'" + pokemon.getTinggi() + "',"
            + "'" + pokemon.getBerat() + "'"
            + ")";
    try {
      affectedRows = qe.queryIUD(query);
    } catch (SQLException ex) {
      System.err.println("Error in tambah(): " + ex.getMessage());
    }
    return affectedRows;
  }

  public int tambahTableMany2Many(Pokemon pokemon, String tabel) {

    ArrayList<Integer> tabelnya;
    tabelnya = (tabel.equals("tipe") ? pokemon.getTipe() : pokemon.getKemampuan());

    String sql = "INSERT INTO `" + tabel + "`(`pokemon_id`, `" + tabel + "_id`)";

    for (int i = 0; i < tabelnya.size(); i++) {
      sql += "VALUES ("
              + "'" + pokemon.getId() + "',"
              + "'" + tabelnya.get(i) + "',"
              + "),";
    }

    try {
      affectedRows = qe.queryIUD(sql);
    } catch (SQLException ex) {
      System.err.println("Error in tambahM2M(): " + ex.getMessage());
    }
    return affectedRows;

  }

  // Read
  public void loadTabel(DefaultTableModel model, String tipe) {
    model.addColumn("ID");
    model.addColumn("Pokedex ID");
    model.addColumn("Nama");
    model.addColumn("Tipe");
    model.addColumn("Tinggi");
    model.addColumn("Berat");
    model.addColumn("Kemampuan");

    try {
      ResultSet res = qe.querySelect(
              "SELECT "
              + "pkmn.id, "
              + "pkmn.pokedex_id, "
              + "GROUP_CONCAT(DISTINCT tp.nama SEPARATOR ', ') AS tipe, "
              + "pkmn.nama, "
              + "pkmn.tinggi, "
              + "pkmn.berat, "
              + "GROUP_CONCAT(DISTINCT kmpn.nama SEPARATOR ', ') AS kemampuan "
              + "FROM pokemon pkmn "
              + "JOIN pokemon_tipe pkmn_tp ON pkmn_tp.pokemon_id = pkmn.id "
              + "JOIN tipe tp ON tp.id = pkmn_tp.tipe_id "
              + "JOIN kemampuan_pokemon kmpn_pkmn ON kmpn_pkmn.pokemon_id = pkmn.id "
              + "JOIN kemampuan kmpn ON kmpn.id = kmpn_pkmn.kemampuan_id "
              + "GROUP BY pkmn.pokedex_id "
              + ((!tipe.equals("Semua")) ? "HAVING tipe LIKE '%" + tipe + "%'" : "")
      );

      while (res.next()) {
        Object[] o = new Object[7];
        o[0] = res.getString("id");
        o[1] = res.getString("pokedex_id");
        o[2] = res.getString("nama");
        o[3] = res.getString("tipe");
        o[4] = res.getString("tinggi");
        o[5] = res.getString("berat");
        o[6] = res.getString("kemampuan");

        model.addRow(o);
      }

    } catch (SQLException ex) {
      System.err.println("Error in getTipePokemon: " + ex.getMessage());
    } finally {
      qe.closeConn();
    }
  }

  // Update
  public int edit(Pokemon pokemon) {
    String query = "UPDATE `pokemon` SET `"
            + "pokedex_id`='',"
            + "`nama`='',"
            + "`tinggi`='',"
            + "`berat`=''"
            + " WHERE `id`=''";
    try {
      affectedRows = qe.queryIUD(query);
    } catch (SQLException ex) {
      System.err.println("Error in tambah(): " + ex.getMessage());
    }
    return affectedRows;
  }

  // Delete
  public int hapus(Pokemon pokemon) {
    String query = "DELETE FROM `pokemon` WHERE `id`=''";
    try {
      affectedRows = qe.queryIUD(query);
    } catch (SQLException ex) {
      System.err.println("Error in tambah(): " + ex.getMessage());
    }
    return affectedRows;
  }
}
