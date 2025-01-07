SELECT
    p.product_code,
    p.price * SUM(s.sales_amount) AS sales
FROM
    product AS p
JOIN
    offline_sale AS s ON p.product_id = s.product_id
GROUP BY
    p.product_code
ORDER BY
    sales DESC,
    p.product_code ASC