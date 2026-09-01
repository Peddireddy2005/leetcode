# Write your MySQL query statement below
SELECT r.contest_id,ROUND(COUNT(r.user_id)*100 / (SELECT COUNT(*) FROM USERS),2) AS percentage
FROM Register as r
GROUP BY contest_id
ORDER BY percentage desc,contest_id;