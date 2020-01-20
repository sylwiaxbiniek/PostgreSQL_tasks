package com.biniek.sylwia.zadanie_1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Podsumowanie{


  @GeneratedValue(strategy=GenerationType.AUTO)
  @Id int id;
  public String kategoriaPodsumowania;
  public double kwota;

  public Podsumowanie(String kategoriaPodsumowania, double kwota) {
       this.kategoriaPodsumowania = kategoriaPodsumowania;
       this.kwota = kwota;
 }

  @Override
  public String toString() {
      return String.format(
              "Podsumowanie[id=%d, kategoria=%d , kwota='%s']",
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
