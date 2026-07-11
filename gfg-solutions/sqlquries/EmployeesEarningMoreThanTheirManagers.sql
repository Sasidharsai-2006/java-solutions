select name as Employee
from Employee as e
where managerId is not null and salary >(
    select salary 
    from  Employee as ee
    where e.managerId=ee.id
);