SELECT project_id, ROUND(SUM(experience_years)/count(project_id),2) as average_years
from Project as p
LEFT JOIN Employee as e
ON P.employee_id=e.employee_id
group by p.project_id;