```sql
WITH dzieci_wiek AS
(
  SELECT
    id,
    imie,
    data_urodzenia,
    DATE_PART('year', '2019-12-01'::date) - DATE_PART('year', data_urodzenia::date) AS wiek
  FROM dzieci
)
SELECT
  id,
  imie,
  data_urodzenia,
  wiek,
  (
    CASE
    WHEN wiek < 5 THEN
      'A'
    WHEN wiek < 10 THEN
      'B'
    ELSE
      'C'
    END
  ) AS grupa_wiekowa
FROM
  dzieci_wiek
WHERE
  wiek < 18
ORDER BY
  wiek ASC;
```
