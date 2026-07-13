# Write your MySQL query statement below
select employee_id
from Employees
where employee_id NOT IN(
    select Distinct employee_id from Salaries
)

union 

select employee_id
from Salaries
where employee_id NOT IN(
    select Distinct employee_id from Employees
)

order by employee_id;