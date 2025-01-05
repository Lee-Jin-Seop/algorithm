SELECT
    animal_type,
    COUNT(*) AS count
FROM
    animal_ins
WHERE
    animal_type IN ('Dog', 'Cat')
GROUP BY
    animal_type
ORDER BY
    animal_type