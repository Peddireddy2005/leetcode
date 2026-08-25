# Write your MySQL query statement below
SELECT Distinct author_id as id
FROM Views
where author_id = viewer_id
Order By id asc;