from (
    select e.name AS Employee,e.salary,e.departmentId,d.name AS Department,
    DENSE_RANK() OVER(PARTITION BY d.name ORDER BY e.salary DESC) AS RNK
    from Employee as e 
    LEFT JOIN Department as d
    ON e.departmentId=d.id
)T 
WHERE RNK<=3;