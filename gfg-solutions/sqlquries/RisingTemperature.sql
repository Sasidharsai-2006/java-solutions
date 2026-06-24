select id
from (
    select id,
         temperature,
         recordDate,
         LAG(temperature) over(order by recordDate ) as prev_value,
         LAG(recordDate) OVER(ORDER BY recordDate) AS prev_date
         from Weather
) t
where temperature >prev_value
AND DATEDIFF(recordDate, prev_date) = 1;