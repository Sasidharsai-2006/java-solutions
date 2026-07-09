select machine_id,
round(
    (sum(
    CASE when activity_type ='end' then timestamp  END)
    -
    sum(CASE when activity_type ='start' then timestamp END )
    )/COUNT(DISTINCT process_id),3
) as processing_time 
from Activity
group by machine_id;
