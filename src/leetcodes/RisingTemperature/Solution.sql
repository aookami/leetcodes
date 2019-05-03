# Write your MySQL query statement below
select w2.Id from Weather as w1 inner join Weather as w2 on w1.RecordDate = w2.RecordDate - INTERVAL 1 DAY where w2.Temperature > w1.Temperature
