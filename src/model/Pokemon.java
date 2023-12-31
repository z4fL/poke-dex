package model;

import java.util.List;

/**
 *
 * @author ZAFL
 */
public class Pokemon {

  private int id;
  private int pokedexId;
  private List<String> tipeNama;
  private List<Integer> tipeId;
  private List<Integer> tipePokemonId;
  private String nama;
  private float tinggi;
  private float berat;
  private List<String> kemampuanNama;
  private List<Integer> kemampuanId;
  private List<Integer> kemampuanPokemonId;

  public Pokemon() {
  }

  public Pokemon(int id, int pokedexId, List<String> tipeNama, List<Integer> tipeId, List<Integer> tipePokemonId, String nama, float tinggi, float berat, List<String> kemampuanNama, List<Integer> kemampuanId, List<Integer> kemampuanPokemonId) {
    this.id = id;
    this.pokedexId = pokedexId;
    this.tipeNama = tipeNama;
    this.tipeId = tipeId;
    this.tipePokemonId = tipePokemonId;
    this.nama = nama;
    this.tinggi = tinggi;
    this.berat = berat;
    this.kemampuanNama = kemampuanNama;
    this.kemampuanId = kemampuanId;
    this.kemampuanPokemonId = kemampuanPokemonId;
  }

  public Pokemon(int id, int pokedexId, List<Integer> tipeId, String nama, float tinggi, float berat, List<Integer> kemampuanId) {
    this.id = id;
    this.pokedexId = pokedexId;
    this.tipeId = tipeId;
    this.nama = nama;
    this.tinggi = tinggi;
    this.berat = berat;
    this.kemampuanId = kemampuanId;
  }

  public Pokemon(int id, int pokedexId, List<Integer> tipeId, List<Integer> tipePokemonId, String nama, float tinggi, float berat, List<Integer> kemampuanId, List<Integer> kemampuanPokemonId) {
    this.id = id;
    this.pokedexId = pokedexId;
    this.tipeId = tipeId;
    this.tipePokemonId = tipePokemonId;
    this.nama = nama;
    this.tinggi = tinggi;
    this.berat = berat;
    this.kemampuanId = kemampuanId;
    this.kemampuanPokemonId = kemampuanPokemonId;
  }
  

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getPokedexId() {
    return pokedexId;
  }

  public void setPokedexId(int pokedexId) {
    this.pokedexId = pokedexId;
  }

  public List<String> getTipeNama() {
    return tipeNama;
  }

  public void setTipeNama(List<String> tipeNama) {
    this.tipeNama = tipeNama;
  }

  public List<Integer> getTipeId() {
    return tipeId;
  }

  public void setTipeId(List<Integer> tipeId) {
    this.tipeId = tipeId;
  }

  public List<Integer> getTipePokemonId() {
    return tipePokemonId;
  }

  public void setTipePokemonId(List<Integer> tipePokemonId) {
    this.tipePokemonId = tipePokemonId;
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

  public List<String> getKemampuanNama() {
    return kemampuanNama;
  }

  public void setKemampuanNama(List<String> kemampuanNama) {
    this.kemampuanNama = kemampuanNama;
  }

  public List<Integer> getKemampuanId() {
    return kemampuanId;
  }

  public void setKemampuanId(List<Integer> kemampuanId) {
    this.kemampuanId = kemampuanId;
  }

  public List<Integer> getKemampuanPokemonId() {
    return kemampuanPokemonId;
  }

  public void setKemampuanPokemonId(List<Integer> kemampuanPokemonId) {
    this.kemampuanPokemonId = kemampuanPokemonId;
  }

  @Override
  public String toString() {
    return "Pokemon{" + "id=" + id + ", pokedexId=" + pokedexId + ", tipeNama=" + tipeNama + ", tipeId=" + tipeId + ", tipePokemonId=" + tipePokemonId + ", nama=" + nama + ", tinggi=" + tinggi + ", berat=" + berat + ", kemampuanNama=" + kemampuanNama + ", kemampuanId=" + kemampuanId + ", kemampuanPokemonId=" + kemampuanPokemonId + '}';
  }

}
