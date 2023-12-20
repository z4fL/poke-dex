package model;

import java.util.ArrayList;

/**
 *
 * @author ZAFL
 */
public class Pokemon {

  private int id;
  private int pokedex_id;
  private String nama;
  private float tinggi;
  private float berat;
  private ArrayList<Integer> tipe;
  private ArrayList<Integer> kemampuan;

  public Pokemon(int id, int pokedex_id, String nama, float tinggi, float berat, ArrayList<Integer> tipe, ArrayList<Integer> kemampuan) {
    this.id = id;
    this.pokedex_id = pokedex_id;
    this.nama = nama;
    this.tinggi = tinggi;
    this.berat = berat;
    this.tipe = tipe;
    this.kemampuan = kemampuan;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getPokedex_id() {
    return pokedex_id;
  }

  public void setPokedex_id(int pokedex_id) {
    this.pokedex_id = pokedex_id;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public float getTinggi() {
    return tinggi;
  }

  public void setTinggi(float tinggi) {
    this.tinggi = tinggi;
  }

  public float getBerat() {
    return berat;
  }

  public void setBerat(float berat) {
    this.berat = berat;
  }

  public ArrayList<Integer> getTipe() {
    return tipe;
  }

  public void setTipe(ArrayList<Integer> tipe) {
    this.tipe = tipe;
  }

  public ArrayList<Integer> getKemampuan() {
    return kemampuan;
  }

  public void setKemampuan(ArrayList<Integer> kemampuan) {
    this.kemampuan = kemampuan;
  }

  @Override
  public String toString() {
    return "Pokemon{"
            + "id=" + id
            + ", pokedex_id=" + pokedex_id
            + ", nama='" + nama + '\''
            + ", tinggi=" + tinggi
            + ", berat=" + berat
            + ", tipe=" + tipe
            + ", kemampuan=" + kemampuan
            + '}';
  }

}
