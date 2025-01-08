SELECT
    DISTINCT c.car_id
FROM
    car_rental_company_car AS c
JOIN
    car_rental_company_rental_history AS h ON c.car_id = h.car_id
WHERE
    c.car_type = '세단' -- 자동차 종류가 세단
    AND h.start_date BETWEEN '2022-10-01' AND '2022-10-31' -- 10월에 대여를 시작한 기록
ORDER BY
    c.car_id DESC