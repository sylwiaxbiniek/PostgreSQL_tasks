package com.biniek.sylwia.zadanie_1;


public class KategoriePodsumowania {

    public Integer id_kategorii;
    public String nazwaKategorii;
    public int kolejnoscSortowania;
    public double wartosc = 0;


    public KategoriePodsumowania(int id_kategorii, String nazwaKategorii, int kolejnoscSortowania) {
        this.id_kategorii = id_kategorii;
        this.nazwaKategorii = nazwaKategorii;
        this.kolejnoscSortowania = kolejnoscSortowania;
    }
   }
