-- 코드를 입력하세요
SELECT A.CATEGORY, SUM(B.SALES) AS TOTAL_SALES
FROM BOOK A JOIN BOOK_SALES B ON A.BOOK_ID=B.BOOK_ID
WHERE SALES_DATE LIKE '%2022-01%'
GROUP BY CATEGORY
ORDER BY 1
