```sql
SELECT
  pracownicy.id,
  pracownicy.imie,
  pracownicy.nazwisko
FROM  
  pracownicy
LEFT JOIN dzieci ON
  pracownicy.id = dzieci.rodzic1id
  OR pracownicy.id = dzieci.rodzic2id
WHERE
  dzieci.rodzic1id IS NULL
  AND dzieci.rodzic2id IS NULL;
```
