package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pokemon;

/**
 *
 * @author ZAFL
 */
public class TablePokemonController extends AbstractTableModel {

  List<Pokemon> listPokemon = new ArrayList<>();

  public void addRow(Pokemon pokemon) {
    listPokemon.add(pokemon);
//    System.out.println("Row: " + getRowCount() + " | " + "Col: " + getColumnCount());
    fireTableRowsInserted(getRowCount(), getRowCount());
  }

  public void removeRow(int firstRow, int lastRow) {
    listPokemon.remove(firstRow);
    fireTableRowsDeleted(firstRow, lastRow);
  }

  public void removeAll() {
    int size = listPokemon.size();
    listPokemon.clear();
    fireTableRowsDeleted(0, size);
  }

  @Override
  public int getRowCount() {
    return listPokemon.size();
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
        return String.format("%04d", listPokemon.get(rowIndex).getPokedexId());
      case 2:
        return listPokemon.get(rowIndex).getNama();
      case 3:
        return strArr2String(listPokemon.get(rowIndex).getTipeNama());
      case 4:
        return listPokemon.get(rowIndex).getTinggi() + " m";
      case 5:
        return listPokemon.get(rowIndex).getBerat() + " kg";
      case 6:
        return strArr2String(listPokemon.get(rowIndex).getKemampuanNama());
      case 7:
        return intArr2String(listPokemon.get(rowIndex).getTipePokemonId());
      case 8:
        return intArr2String(listPokemon.get(rowIndex).getKemampuanPokemonId());
      default:
        throw new AssertionError();
    }
  }

  public String strArr2String(List<String> column) {
    String result = "";
    for (int i = 0; i < column.size(); i++) {
      result += column.get(i);
      if (i < column.size() - 1) {
        result += ", ";
      }
    }

    return result;
  }

  public String intArr2String(List<Integer> column) {
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
