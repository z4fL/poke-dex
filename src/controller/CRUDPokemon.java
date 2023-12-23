package controller;

import core.QueryExecutor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTable;
import model.Pokemon;

/**
 *
 * @author ZAFL
 */
public class CRUDPokemon {

  QueryExecutor qe = new QueryExecutor();
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
    System.out.println(query);
//    try {
//      affectedRows = qe.queryIUD(query);
//    } catch (SQLException ex) {
//      System.err.println("Error in tambah(): " + ex.getMessage());
//    }
    return affectedRows;
  }

  public int tambahTableMany2Many(Pokemon pokemon, String tabel) {
    ArrayList<String> tabelnya = (tabel.equals("tipe") ? pokemon.getTipe_id() : pokemon.getKemampuan_id());
    String query = "INSERT INTO `" + (tabel.equals("tipe") ? "pokemon_tipe" : "kemampuan_pokemon") + "` (`pokemon_id`, `" + tabel + "_id`) VALUES ";

    for (int i = 0; i < tabelnya.size(); i++) {
      if (!tabelnya.get(i).equals("0")) {
        query += "('" + pokemon.getId() + "', "
                + "'" + tabelnya.get(i) + "')";
      }
      if (i < tabelnya.size() - 1 && !tabelnya.get(i + 1).equals("0")) {
        query += ",";
      }
    }
    System.out.println(query);
//    try {
//      affectedRows = qe.queryIUD(query);
//    } catch (SQLException ex) {
//      System.err.println("Error in tambahM2M(): " + ex.getMessage());
//    }

    return affectedRows;
  }

  // Read
  public void loadTable(String tipe, JTable table, TablePokemon tableModel) {
    try {
      int row = table.getRowCount();
      for (int i = 0; i < row; i++) {
        tableModel.removeRow(0, 1);
      }

      ResultSet res = qe.querySelect(
              "SELECT "
              + "pkmn.id, "
              + "pkmn.pokedex_id, "
              + "GROUP_CONCAT(DISTINCT tp.nama SEPARATOR ', ') AS tipe, "
              + "GROUP_CONCAT(DISTINCT tp.id SEPARATOR ', ') AS tipe_id,"
              + "GROUP_CONCAT(DISTINCT pkmn_tp.id SEPARATOR ', ') AS tipe_pokemon_id, "
              + "pkmn.nama, "
              + "pkmn.tinggi, "
              + "pkmn.berat, "
              + "GROUP_CONCAT(DISTINCT kmpn.nama SEPARATOR ', ') AS kemampuan, "
              + "GROUP_CONCAT(DISTINCT kmpn.id SEPARATOR ', ') AS kemampuan_id, "
              + "GROUP_CONCAT(DISTINCT kmpn_pkmn.id SEPARATOR ', ') AS kemampuan_pokemon_id "
              + "FROM pokemon pkmn "
              + "JOIN pokemon_tipe pkmn_tp ON pkmn_tp.pokemon_id = pkmn.id "
              + "JOIN tipe tp ON tp.id = pkmn_tp.tipe_id "
              + "JOIN kemampuan_pokemon kmpn_pkmn ON kmpn_pkmn.pokemon_id = pkmn.id "
              + "JOIN kemampuan kmpn ON kmpn.id = kmpn_pkmn.kemampuan_id "
              + "GROUP BY pkmn.pokedex_id "
              + ((!tipe.equals("Semua")) ? "HAVING tipe LIKE '%" + tipe + "%'" : "")
      );

      while (res.next()) {
        Pokemon p = new Pokemon();
        p.setId(res.getInt("id"));
        p.setPokedex_id(res.getInt("pokedex_id"));
        p.setNama(res.getString("nama"));
        p.setTinggi(res.getFloat("tinggi"));
        p.setBerat(res.getFloat("berat"));
        p.setTipe(new ArrayList<>(Arrays.asList(res.getString("tipe").split(", "))));
        p.setTipe_id(new ArrayList<>(Arrays.asList(res.getString("tipe_id").split(", "))));
        p.setTipe_pokemon_id(new ArrayList<>(Arrays.asList(res.getString("tipe_pokemon_id").split(", "))));
        p.setKemampuan(new ArrayList<>(Arrays.asList(res.getString("kemampuan").split(", "))));
        p.setKemampuan_id(new ArrayList<>(Arrays.asList(res.getString("kemampuan_id").split(", "))));
        p.setKemampuan_pokemon_id(new ArrayList<>(Arrays.asList(res.getString("kemampuan_pokemon_id").split(", "))));

        tableModel.addRow(p);
      }

//      tbPokemon.getColumnModel().getColumn(0).setMinWidth(0);
//      tbPokemon.getColumnModel().getColumn(0).setMaxWidth(0);
//      tbPokemon.getColumnModel().getColumn(0).setWidth(0);
    } catch (SQLException ex) {
      System.err.println("Error in loadTable: " + ex.getMessage());
    } finally {
      qe.closeConn();
    }
  }

  // Update
  public int edit(Pokemon pokemon) {
    String query = "UPDATE `pokemon` SET `"
            + "pokedex_id`='" + pokemon.getPokedex_id() + "',"
            + "`nama`='" + pokemon.getNama() + "',"
            + "`tinggi`='" + pokemon.getTinggi() + "',"
            + "`berat`='" + pokemon.getBerat() + "'"
            + " WHERE `id`='" + pokemon.getId() + "'";
    System.out.println(query);
//    try {
//      affectedRows = qe.queryIUD(query);
//    } catch (SQLException ex) {
//      System.err.println("Error in edit(): " + ex.getMessage());
//    }

    return affectedRows;
  }

  public int ubahTableMany2Many(Pokemon pokemon, String tabel) {
    ArrayList<String> tabel_id = (tabel.equals("tipe") ? pokemon.getTipe_id() : pokemon.getKemampuan_id());
    ArrayList<String> tabel_m2m_id = (tabel.equals("tipe") ? pokemon.getTipe_pokemon_id() : pokemon.getKemampuan_pokemon_id());

    for (int i = 0; i < tabel_id.size(); i++) {
      if (!tabel_id.get(i).equals("0")) {
        String query = "UPDATE `" + (tabel.equals("tipe") ? "pokemon_tipe" : "kemampuan_pokemon") + "` SET "
                + "`pokemon_id`='" + pokemon.getId() + "',"
                + "`" + (tabel.equals("tipe") ? "tipe_id " : "kemampuan_id ") + "`='" + tabel_id.get(i) + "' "
                + "WHERE `id`='" + tabel_m2m_id.get(i) + "'";
        System.out.println(query);
//        try {
//          affectedRows = qe.queryIUD(query);
//        } catch (SQLException ex) {
//          System.err.println("Error in tambahM2M(): " + ex.getMessage());
//        }
      }
    }

    return affectedRows;
  }

  // Delete
  public int hapus(Pokemon pokemon) {
    String query = "DELETE FROM `pokemon` WHERE `id`='" + pokemon.getId() + "'";
    System.out.println(query);
//    try {
//      affectedRows = qe.queryIUD(query);
//    } catch (SQLException ex) {
//      System.err.println("Error in hapus(): " + ex.getMessage());
//    }
    return affectedRows;
  }

  public int hapusTableMany2Many(Pokemon pokemon, String tabel) {
    ArrayList<String> tabel_m2m_id = (tabel.equals("tipe") ? pokemon.getTipe_pokemon_id() : pokemon.getKemampuan_pokemon_id());

    for (int i = 0; i < tabel_m2m_id.size(); i++) {
      String query = "DELETE FROM `" + (tabel.equals("tipe") ? "pokemon_tipe" : "kemampuan_pokemon") + "` WHERE `id`='" + tabel_m2m_id.get(i) + "'";
      System.out.println(query);
//      try {
//        affectedRows = qe.queryIUD(query);
//      } catch (SQLException ex) {
//        System.err.println("Error in hapus(): " + ex.getMessage());
//      }
    }

    return affectedRows;
  }
}
