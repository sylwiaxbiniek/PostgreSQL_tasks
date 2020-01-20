package com.biniek.sylwia.zadanie_1;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Zadanie1Application {

//	public static void createNewDatabase(String fileName) {

    //     String url = "jdbc:sqlite:C:/sqlite/db/" + fileName;
		//
    //     try (Connection conn = DriverManager.getConnection(url)) {
    //         if (conn != null) {
    //             DatabaseMetaData meta = conn.getMetaData();
    //             System.out.println("The driver name is " + meta.getDriverName());
    //             System.out.println("A new database has been created.");
    //         }
		//
    //     } catch (SQLException e) {
    //         System.out.println(e.getMessage());
    //     }
    // }

	public static void main(String[] args) {

		List<DaneWejsciowe> uslugi = new ArrayList<>();
		List<KategoriePodsumowania> kategorie = new ArrayList<>();
		List<Podsumowanie> pods = new ArrayList<>();

		uslugi.add(new DaneWejsciowe("Abonament za internet", 40.00, 1));
		uslugi.add(new DaneWejsciowe("Bezpieczny internet", 9.90, 3));
		uslugi.add(new DaneWejsciowe("Telewizja pakiet pelny", 80.00, 2));
		uslugi.add(new DaneWejsciowe("GigaNagrywarka", 15.00, 2));
		uslugi.add(new DaneWejsciowe("Rabat za internet", -20.00, 1));

		kategorie.add(new KategoriePodsumowania(1, "Internet", 1));
		kategorie.add(new KategoriePodsumowania(2, "Telewizja", 3));
		kategorie.add(new KategoriePodsumowania(3, "Uslugi dodatkowe", 2));

		/*KategoriePodsumowania internet = new KategoriePodsumowania(1, "Internet", 1);
		KategoriePodsumowania telewizja = new KategoriePodsumowania(2, "Telewizja", 3);
		KategoriePodsumowania uslugi_dodatkowe = new KategoriePodsumowania(3, "Uslugi dodatkowe", 2);

		DaneWejsciowe abo_internet = new DaneWejsciowe("Abonament za internet", 40.00, 1);
		DaneWejsciowe bezp_internet = new DaneWejsciowe("Bezpieczny internet", 9.90, 3);
		DaneWejsciowe pakiet_pelny = new DaneWejsciowe("Telewizja pakiet pelny", 80.00, 2);
		DaneWejsciowe nagrywarka = new DaneWejsciowe("GigaNagrywarka", 15.00, 2);
		DaneWejsciowe rabat = new DaneWejsciowe("Rabat za internet", -20.00, 1);
		*/

		for(DaneWejsciowe usluga:uslugi){
				int id_uslugi = usluga.id_kategorii;
				KategoriePodsumowania kategoria = kategorie.get(id_uslugi-1);
				kategoria.wartosc += usluga.cenaUslugi;
			}

			kategorie.sort((a, b) -> a.kolejnoscSortowania - b.kolejnoscSortowania);

			for (KategoriePodsumowania kategoria : kategorie) {
			pods.add(new Podsumowanie(kategoria.nazwaKategorii, kategoria.wartosc));
			//baza_danych.save(new Podsumowanie(kategoria.nazwaKategorii, kategoria.wartosc));
		}
		//createNewDatabase("test.db");

		System.out.println(pods);
	}
}
