```sql
SELECT
    dzieci.id id_dziecka,
    dzieci.imie imie_dziecka,
    dzieci.data_urodzenia data_urodzenia,
    rodzic_1.imie imie_pierwszego_rodzica,
    rodzic_1.nazwisko nazwisko_pierwszego_rodzica,
    rodzic_2.imie imie_drugiego_rodzica,
    rodzic_2.nazwisko nazwisko_drugiego_rodzica
FROM
    dzieci
LEFT JOIN pracownicy AS rodzic_1 ON dzieci.rodzic1id = rodzic_1.id
LEFT JOIN pracownicy AS rodzic_2 ON dzieci.rodzic2id = rodzic_2.id;
```
