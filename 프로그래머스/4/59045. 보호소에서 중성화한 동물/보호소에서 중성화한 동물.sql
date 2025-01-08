SELECT
    i.animal_id,
    i.animal_type,
    i.name
FROM
    animal_ins AS i
JOIN
    animal_outs AS o ON i.animal_id = o.animal_id
WHERE
    i.sex_upon_intake REGEXP 'Intact' -- 중성화 x
    AND o.sex_upon_outcome REGEXP 'Spayed|Neutered' -- 중성화 o
ORDER BY
    i.animal_id