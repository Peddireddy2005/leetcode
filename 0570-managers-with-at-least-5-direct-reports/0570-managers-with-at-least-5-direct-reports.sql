# Write your MySQL query statement below
SELECT m.name
FROM Employee as e
JOIN Employee as m
 on e.managerID = m.id
GROUP BY m.name,m.id
HAVING COUNT(e.id)>=5;