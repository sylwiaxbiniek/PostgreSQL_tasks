```sql
SELECT
  nazwisko,
  COUNT(nazwisko) AS ilosc_wystapien
FROM
  pracownicy
GROUP BY
  nazwisko
HAVING
  COUNT(nazwisko) > 1
ORDER BY
  nazwisko ASC;
```
