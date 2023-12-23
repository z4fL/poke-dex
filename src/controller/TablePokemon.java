package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pokemon;

/**
 *
 * @author ZAFL
 */
public class TablePokemon extends AbstractTableModel {

  List<Pokemon> listPokemon = new ArrayList<>();

  public void addRow(Pokemon pokemon) {
    listPokemon.add(pokemon);
    fireTableRowsInserted(getRowCount(), getColumnCount());
  }

  public void removeRow(int firstRow, int lastRow) {
    listPokemon.remove(firstRow);
    fireTableRowsDeleted(firstRow, lastRow);
  }

  @Override
  public int getRowCount() {
    return listPokemon.size();
  }

  @Override
  public int getColumnCount() {
    return 9;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    switch (columnIndex) {
      case 0:
        return listPokemon.get(rowIndex).getId();
      case 1:
        return String.format("%04d", listPokemon.get(rowIndex).getPokedex_id());
      case 2:
        return listPokemon.get(rowIndex).getNama();
      case 3:
        return array2String(listPokemon.get(rowIndex).getTipe());
      case 4:
        return listPokemon.get(rowIndex).getTinggi();
      case 5:
        return listPokemon.get(rowIndex).getBerat();
      case 6:
        return array2String(listPokemon.get(rowIndex).getKemampuan());
      case 7:
        return array2String(listPokemon.get(rowIndex).getTipe_pokemon_id());
      case 8:
        return array2String(listPokemon.get(rowIndex).getKemampuan_pokemon_id());
      default:
        throw new AssertionError();
    }
  }

  @Override
  public String getColumnName(int column) {
    switch (column) {
      case 0:
        return "ID";
      case 1:
        return "Pokedex ID";
      case 2:
        return "Nama";
      case 3:
        return "Tipe";
      case 4:
        return "Tinggi";
      case 5:
        return "Berat";
      case 6:
        return "Kemampuan";
      case 7:
        return "Tipe Pokemon ID";
      case 8:
        return "Kemampuan Pokemon ID";
      default:
        throw new AssertionError();
    }
  }

  public String array2String(ArrayList<String> column) {
    String result = "";
    for (int i = 0; i < column.size(); i++) {
      result += column.get(i);
      if (i < column.size() - 1) {
        result += ", ";
      }
    }

    return result;
  }

}
