SELECT
    *
FROM
    car_rental_company_car
WHERE
    options REGEXP '네비게이션'
ORDER BY
    car_id DESC