package com.biniek.sylwia.zadanie_1;

public class Podsumowanie{


  int id;
  public String kategoriaPodsumowania;
  public double kwota;

  public Podsumowanie(String kategoriaPodsumowania, double kwota) {
       this.kategoriaPodsumowania = kategoriaPodsumowania;
       this.kwota = kwota;
 }

  @Override
  public String toString() {
      return String.format(
              "Podsumowanie[id='%d', kategoria='%s' , kwota='%.2f']",
              id, kategoriaPodsumowania, kwota);
  }

  public int getId() {
      return id;
  }

  public String getKategoria(){
      return kategoriaPodsumowania;
  }

  public double getKwota() {
      return kwota;
  }
}
