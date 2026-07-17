select transaction_date ,
IFNULL(SUM(CASE WHEN amount%2!=0 then amount END),0) AS odd_sum,
IFNULL(SUM(CASE WHEN amount%2=0 then amount END),0) AS even_sum
from transactions
group by transaction_date
order by transaction_date;