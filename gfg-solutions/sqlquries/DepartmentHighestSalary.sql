select Department,Employee,Salary
from(
    select e.name as Employee,e.salary as Salary,e.departmentId,d.name as Department,
    RANK() OVER(PARTITION BY d.name ORDER BY salary DESC) as rnk
    from Employee as e 
    Left join Department as d 
    ON e.departmentId=d.id
) t
where rnk=1;