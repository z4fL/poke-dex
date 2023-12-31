package model;

import java.util.Objects;

/**
 *
 * @author ZAFL
 */
public class ComboBoxItem {

  private int id;
  private String nama;

  public ComboBoxItem() {

  }

  public ComboBoxItem(int id, String nama) {
    this.id = id;
    this.nama = nama;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  @Override
  public String toString() {
    return nama;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (obj instanceof ComboBoxItem comboBoxItem) {
      return comboBoxItem.getNama().equals(getNama());
    } else if (obj instanceof String) {
      return nama.equals(obj);
    } else {
      return super.equals(obj);
    }

  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 53 * hash + this.id;
    hash = 53 * hash + Objects.hashCode(this.nama);
    return hash;
  }

}
