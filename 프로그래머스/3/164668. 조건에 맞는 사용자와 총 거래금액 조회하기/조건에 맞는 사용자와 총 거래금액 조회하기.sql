SELECT
    u.user_id,
    u.nickname,
    SUM(b.price) AS total_sales
FROM
    used_goods_user AS u
JOIN
    used_goods_board AS b ON u.user_id = b.writer_id
WHERE
    b.status = 'DONE' -- 완료된 거래
GROUP BY
    u.user_id
HAVING
    total_sales >= 700000 -- 총금액이 70만원 이상
ORDER BY
    total_sales