SELECT
    COUNT(*) AS fish_count,
    n.fish_name
FROM
    fish_name_info AS n
JOIN
    fish_info AS i ON n.fish_type = i.fish_type
GROUP BY
    n.fish_name
ORDER BY
    fish_count DESC