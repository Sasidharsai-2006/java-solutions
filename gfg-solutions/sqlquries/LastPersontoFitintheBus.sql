select person_name
from(
    select person_id,person_name,weight,turn,
    sum(weight) over(order by turn) as runsum
    from Queue 
) t 
where runsum<=1000
ORDER BY turn DESC
LIMIT 1;