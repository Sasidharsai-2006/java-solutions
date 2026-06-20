select *
from Cinema as c
where c.id %2=1 and c.description != 'boring'
ORDER BY c.rating DESC;