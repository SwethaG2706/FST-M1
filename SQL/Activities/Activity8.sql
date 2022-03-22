Select customer_id, MAX(purchase_amount) as "Max amount" from orders GROUP BY customer_id;

select salesman_id, order_date, MAX(purchase_amount) as "Max amount" from orders where order_date = To_Date ('2012-08-17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

Select customer_id, order_date, MAX(purchase_amount) as "Max amount" from orders 
GROUP BY customer_id, order_date
having MAX(purchase_amount) IN (2030, 3450, 5760, 6000);