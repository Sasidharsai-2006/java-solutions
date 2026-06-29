select Distinct email  as Email
from Person 
where email IN (
    select email
    from Person
    group by email
    HAVING COUNT(email) >= 2
);
