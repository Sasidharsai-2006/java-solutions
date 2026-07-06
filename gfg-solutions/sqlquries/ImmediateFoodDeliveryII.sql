select ROUND(count(*)/(select count(DISTINCT customer_id) from Delivery)*100,2) as immediate_percentage
from (
    select delivery_id,customer_id,order_date,customer_pref_delivery_date,
    ROW_NUMBER() OVER(PARTITION BY customer_id ORDER BY order_date) AS RNK
    FROM Delivery
)T
where rnk=1 and order_date=customer_pref_delivery_date;