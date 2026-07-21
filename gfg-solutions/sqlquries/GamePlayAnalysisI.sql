select player_id,event_date as first_login 
from(
    select player_id,device_id,event_date,games_played ,
    ROW_NUMBER() OVER(PARTITION BY player_id ORDER BY event_date) as val
    from Activity
)t
where val=1;