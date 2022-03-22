select SUM(purchase_amount) AS "Total sum" from orders;

select AVG(purchase_amount) as "Avg amount" from orders;

select MAX(purchase_amount) as "MAX amount" from orders;

select MIN(purchase_amount) as "MIN amount" from orders;

select COUNT(distinct salesman_id) as "Total Count" from orders;