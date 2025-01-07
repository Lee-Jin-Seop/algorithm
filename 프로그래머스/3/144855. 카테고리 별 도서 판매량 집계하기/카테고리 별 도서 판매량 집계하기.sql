SELECT
    b.category,
    SUM(s.sales) AS total_sales
FROM
    book AS b
JOIN
    book_sales AS s ON b.book_id = s.book_id
WHERE
    s.sales_date BETWEEN '2022-01-01' AND '2022-01-31'
GROUP BY
    b.category
ORDER BY
    b.category