package com.biniek.sylwia.zadanie_1;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Zadanie1Application {

		private Connection connect(String fileName) {
		// SQLite connection string
		String url = "jdbc:sqlite:" + fileName;
		Connection conn = null;
		try {
				conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
				System.out.println(e.getMessage());
		}
		return conn;
}

		public void createTable(){
			String sql = String.join("\n"
         , "CREATE TABLE podsumowanie ("
         , "kategoria_podsumowania TEXT,"
         , "kwota REAL"
         , ");"
				 );

			try (Connection conn = this.connect("test.db");
					PreparedStatement pstmt = conn.prepareStatement(sql)) {
					pstmt.executeUpdate();
			} catch (SQLException e) {
					System.out.println(e.getMessage());
			}
		}

	public void insert(String kategoria, double kwota) {
			 String sql = "INSERT INTO podsumowanie(kategoria_podsumowania,kwota) VALUES(?,?)";

			 try (Connection conn = this.connect("test.db");
					PreparedStatement pstmt = conn.prepareStatement(sql)) {
					 pstmt.setString(1, kategoria);
					 pstmt.setDouble(2, kwota);
					 pstmt.executeUpdate();
			 } catch (SQLException e) {
					 System.out.println(e.getMessage());
			 }
	 }

	public static void main(String[] args) {
		Zadanie1Application baza_danych = new Zadanie1Application();
		baza_danych.createTable();

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

		for(DaneWejsciowe usluga:uslugi){
				int id_uslugi = usluga.id_kategorii;
				KategoriePodsumowania kategoria = kategorie.get(id_uslugi-1);
				kategoria.wartosc += usluga.cenaUslugi;
		}

		kategorie.sort((a, b) -> a.kolejnoscSortowania - b.kolejnoscSortowania);

		for (KategoriePodsumowania kategoria : kategorie) {
			pods.add(new Podsumowanie(kategoria.nazwaKategorii, kategoria.wartosc));
			baza_danych.insert(kategoria.nazwaKategorii, kategoria.wartosc);
		}

		System.out.println(pods);
	}
}
