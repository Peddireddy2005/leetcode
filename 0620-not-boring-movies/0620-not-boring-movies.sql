# Write your MySQL query statement below
SELECT c.id,c.movie,c.description,c.rating
FROM Cinema as c
WHERE MOD(id,2)=1 AND description != 'boring'
ORDER BY rating DESC;