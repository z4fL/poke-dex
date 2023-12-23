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
  private ArrayList<String> tipe_id;
  private ArrayList<String> kemampuan_id;
  private ArrayList<String> tipe;
  private ArrayList<String> kemampuan;
  private ArrayList<String> tipe_pokemon_id;
  private ArrayList<String> kemampuan_pokemon_id;

  public Pokemon() {
  }

  // tambah
  public Pokemon(int id, int pokedex_id, String nama, float tinggi, float berat, ArrayList<String> tipe_id, ArrayList<String> kemampuan_id) {
    this.id = id;
    this.pokedex_id = pokedex_id;
    this.nama = nama;
    this.tinggi = tinggi;
    this.berat = berat;
    this.tipe_id = tipe_id;
    this.kemampuan_id = kemampuan_id;
  }

  public Pokemon(int id, int pokedex_id, String nama, float tinggi, float berat, ArrayList<String> tipe_id, ArrayList<String> kemampuan_id, ArrayList<String> tipe_pokemon_id, ArrayList<String> kemampuan_pokemon_id) {
    this.id = id;
    this.pokedex_id = pokedex_id;
    this.nama = nama;
    this.tinggi = tinggi;
    this.berat = berat;
    this.tipe_id = tipe_id;
    this.kemampuan_id = kemampuan_id;
    this.tipe_pokemon_id = tipe_pokemon_id;
    this.kemampuan_pokemon_id = kemampuan_pokemon_id;
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

  public ArrayList<String> getTipe_id() {
    return tipe_id;
  }

  public void setTipe_id(ArrayList<String> tipe_id) {
    this.tipe_id = tipe_id;
  }

  public ArrayList<String> getKemampuan_id() {
    return kemampuan_id;
  }

  public void setKemampuan_id(ArrayList<String> kemampuan_id) {
    this.kemampuan_id = kemampuan_id;
  }

  public ArrayList<String> getTipe() {
    return tipe;
  }

  public void setTipe(ArrayList<String> tipe) {
    this.tipe = tipe;
  }

  public ArrayList<String> getKemampuan() {
    return kemampuan;
  }

  public void setKemampuan(ArrayList<String> kemampuan) {
    this.kemampuan = kemampuan;
  }

  public ArrayList<String> getTipe_pokemon_id() {
    return tipe_pokemon_id;
  }

  public void setTipe_pokemon_id(ArrayList<String> tipe_pokemon_id) {
    this.tipe_pokemon_id = tipe_pokemon_id;
  }

  public ArrayList<String> getKemampuan_pokemon_id() {
    return kemampuan_pokemon_id;
  }

  public void setKemampuan_pokemon_id(ArrayList<String> kemampuan_pokemon_id) {
    this.kemampuan_pokemon_id = kemampuan_pokemon_id;
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
            + ", tipe_id=" + tipe_id
            + ", tipe_pokemon_id=" + tipe_pokemon_id
            + ", kemampuan=" + kemampuan
            + ", kemampuan_id=" + kemampuan_id
            + ", kemampuan_pokemon_id=" + kemampuan_pokemon_id
            + '}';
  }

}
