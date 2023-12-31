package controller;

import core.QueryExecutor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import model.Pokemon;

/**
 *
 * @author ZAFL
 */
public class PokemonController {

  QueryExecutor qe = new QueryExecutor();
  int affectedRows;

  public int insert(Pokemon pkm) {
    String query = "INSERT INTO `pokemon`(`pokedex_id`, `nama`, `tinggi`, `berat`) VALUES "
        + "('" + pkm.getPokedexId() + "', "
        + "'" + pkm.getNama() + "', "
        + "'" + pkm.getTinggi() + "', "
        + "'" + pkm.getBerat() + "')";
    System.out.println(query);

    try {
      affectedRows = qe.queryIUD(query);
      insertRelationTable("tipe", pkm.getId(), pkm.getTipeId());
      insertRelationTable("kemampuan", pkm.getId(), pkm.getKemampuanId());

      return affectedRows;
    } catch (SQLException e) {
      return 0;
    }
  }

  public void insertRelationTable(String tabel, int pokemonId, List<Integer> dataId) {
    String query = "INSERT INTO `" + (tabel.equals("tipe") ? "pokemon_tipe" : "kemampuan_pokemon")
        + "` (`pokemon_id`, `" + tabel + "_id`) VALUES ";

    for (int i = 0; i < dataId.size(); i++) {
      if (dataId.get(i) != 0) {
        query += "('" + pokemonId + "', '" + dataId.get(i) + "')";
      }
      if (i < dataId.size() - 1 && dataId.get(i + 1) != 0) {
        query += ", ";
      }
    }
    System.out.println(query);

    try {
      affectedRows = qe.queryIUD(query);
    } catch (SQLException e) {
      System.err.println("error :(");
    }
  }

  public void readDataTable(String nama, String tipe, TablePokemonController tableModel) {
    tableModel.removeAll();
    
    String query = "SELECT "
        + "pkmn.id, "
        + "pkmn.pokedex_id, "
        + "GROUP_CONCAT(DISTINCT tp.nama SEPARATOR ', ') AS tipe, "
        + "GROUP_CONCAT(DISTINCT pkmn_tp.id SEPARATOR ', ') AS tipe_pokemon_id, "
        + "pkmn.nama, "
        + "pkmn.tinggi, "
        + "pkmn.berat, "
        + "GROUP_CONCAT(DISTINCT kmpn.nama SEPARATOR ', ') AS kemampuan, "
        + "GROUP_CONCAT(DISTINCT kmpn_pkmn.id SEPARATOR ', ') AS kemampuan_pokemon_id "
        + "FROM pokemon pkmn "
        + "JOIN pokemon_tipe pkmn_tp ON pkmn_tp.pokemon_id = pkmn.id "
        + "JOIN tipe tp ON tp.id = pkmn_tp.tipe_id "
        + "JOIN kemampuan_pokemon kmpn_pkmn ON kmpn_pkmn.pokemon_id = pkmn.id "
        + "JOIN kemampuan kmpn ON kmpn.id = kmpn_pkmn.kemampuan_id "
        + "GROUP BY pkmn.pokedex_id ";

    if (!tipe.equals("Semua") && nama.isEmpty()) {
      query += "HAVING tipe LIKE '%" + tipe + "%' ";
    } else if (!nama.isEmpty() && tipe.equals("Semua")) {
      query += "HAVING nama LIKE '%" + nama + "%' ";
    } else if (!nama.isEmpty() && !tipe.equals("Semua")) {
      query += "HAVING tipe LIKE '%" + tipe + "%' AND nama LIKE '%" + nama + "%' ";
    }

    try {
      List<Map<String, Object>> dataList = qe.querySelect(query);
      for (Map<String, Object> row : dataList) {
        Pokemon p = new Pokemon();
        p.setId(Integer.parseInt(row.get("id").toString()));
        p.setPokedexId(Integer.parseInt(row.get("pokedex_id").toString()));
        p.setTipeNama(Arrays.asList(row.get("tipe").toString().split(", ")));
        p.setTipePokemonId(Arrays.stream(row.get("tipe_pokemon_id").toString().split(", ")).map(Integer::parseInt).collect(Collectors.toList()));
        p.setNama((String) row.get("nama"));
        p.setTinggi((float) row.get("tinggi"));
        p.setBerat((float) row.get("berat"));
        p.setKemampuanNama(Arrays.asList(row.get("kemampuan").toString().split(", ")));
        p.setKemampuanPokemonId(Arrays.stream(row.get("kemampuan_pokemon_id").toString().split(", ")).map(Integer::parseInt).collect(Collectors.toList()));
        tableModel.addRow(p);
      }
    } catch (SQLException e) {
      System.err.println("error in loadDataTable: " + e.getMessage());
    }
  }

  public int update(Pokemon pkm) {
    String query = "UPDATE `pokemon` SET `"
        + "pokedex_id`='" + pkm.getPokedexId() + "',"
        + "`nama`='" + pkm.getNama() + "',"
        + "`tinggi`='" + pkm.getTinggi() + "',"
        + "`berat`='" + pkm.getBerat() + "'"
        + " WHERE `id`='" + pkm.getId() + "'";
    System.out.println(query);
    try {
      affectedRows = qe.queryIUD(query);
      updateRelationTable("tipe", pkm.getTipePokemonId(), pkm.getId(), pkm.getTipeId());
      updateRelationTable("kemampuan", pkm.getKemampuanPokemonId(), pkm.getId(), pkm.getKemampuanId());

      return affectedRows;
    } catch (SQLException e) {
      return 0;
    }
  }

  private void updateRelationTable(String tabel, List<Integer> m2mId, int pokemonId, List<Integer> dataId) {

    for (int i = 0; i < dataId.size(); i++) {
      if (dataId.get(i) != 0) {
        String query = "UPDATE `" + (tabel.equals("tipe") ? "pokemon_tipe" : "kemampuan_pokemon") + "` SET "
            + "`pokemon_id`='" + pokemonId + "',"
            + "`" + (tabel.equals("tipe") ? "tipe_id " : "kemampuan_id ") + "`='" + dataId.get(i) + "' "
            + "WHERE `id`='" + m2mId.get(i) + "'";
        System.out.println(query);
        try {
          affectedRows = qe.queryIUD(query);
        } catch (SQLException ex) {
          System.err.println("Error in editM2M(): " + ex.getMessage());
        }
      }
    }

  }

  public int delete(Pokemon pkm) {
    String query = "DELETE FROM `pokemon` WHERE `id`='" + pkm.getId() + "'";
    System.out.println(query);

    try {
      affectedRows = qe.queryIUD(query);
      return affectedRows;
    } catch (SQLException e) {
      return 0;
    }
  }
}
