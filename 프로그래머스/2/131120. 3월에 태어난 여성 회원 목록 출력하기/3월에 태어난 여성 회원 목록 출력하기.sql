SELECT
    member_id,
    member_name,
    gender,
    DATE_FORMAT(date_of_birth, '%Y-%m-%d') AS date_of_birth
FROM
    member_profile
WHERE
    MONTH(date_of_birth) = 3 -- 3월에 태어난
    AND gender = 'W' -- 여성 회원
    AND tlno IS NOT NULL -- 전화번호가 NULL이 아닌 경우
ORDER BY
    member_id