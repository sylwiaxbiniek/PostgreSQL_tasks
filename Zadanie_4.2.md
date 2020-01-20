```sql
SELECT
    ksiazka.tytul tytul_ksiazki,
    autor1.imie imie_pierwszego_autora,
    autor1.nazwisko nazwisko_pierwszego_autora,
    autor2.imie imie_drugiego_autora,
    autor2.nazwisko nazwisko_drugiego_autora
FROM
    ksiazka
LEFT JOIN autor AS autor1 ON ksiazka.autor1id = autor1.id
LEFT JOIN autor AS autor2 ON ksiazka.autor2id = autor2.id
WHERE
    tytul LIKE 'Harr%';
```
