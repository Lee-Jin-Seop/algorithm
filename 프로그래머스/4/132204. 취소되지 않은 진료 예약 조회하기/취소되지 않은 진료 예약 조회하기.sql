SELECT
    A.APNT_NO,
    P.PT_NAME,
    A.PT_NO,
    A.MCDP_CD,
    D.DR_NAME,
    A.APNT_YMD
FROM
    APPOINTMENT AS A
JOIN
    PATIENT AS P ON A.PT_NO = P.PT_NO
JOIN
    DOCTOR AS D ON A.MDDR_ID = D.DR_ID
WHERE
    DATE_FORMAT(A.APNT_YMD, '%Y-%m-%d') = '2022-04-13'  -- 2022년 4월 13일 --
    AND A.APNT_CNCL_YN = 'N'                            -- 취소되지 않은 --
    AND A.MCDP_CD = 'CS'                                -- 흉부외과(CS) --
ORDER BY
    A.APNT_YMD ASC;                                     -- 진료 예약 일시를 기준으로 오름차순 --