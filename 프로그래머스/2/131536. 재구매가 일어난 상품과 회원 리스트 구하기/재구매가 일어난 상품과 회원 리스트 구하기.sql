-- 코드를 입력하세요
SELECT USER_ID , PRODUCT_ID
from ONLINE_SALE 
group by USER_ID, PRODUCT_ID
HAVING COUNT(*)>1
order by 1 ASC, 2 desc ;