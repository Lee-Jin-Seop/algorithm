WITH max_price AS (
    SELECT
        category,
        MAX(price) AS price
    FROM
        food_product
    WHERE
        category IN ('과자', '국', '김치', '식용유')
    GROUP BY
        category
)

SELECT
    fp.category,
    fp.price AS max_price,
    fp.product_name
FROM
    food_product AS fp
JOIN
    max_price AS mp ON fp.category = mp.category AND fp.price = mp.price
ORDER BY
    max_price DESC;