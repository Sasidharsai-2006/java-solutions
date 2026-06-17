select E.name as name,B.bonus as bonus
FROM Employee  AS E 
LEFT JOIN Bonus AS B
ON E.empId =B.empId 
WHERE B.bonus is null or B.bonus<1000;