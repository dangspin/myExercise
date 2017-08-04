# Write your MySQL query statement below

select Customers.Name as Customers
from Customers
left join orders
on Customers.Id=Orders.CustomerId
where CustomerId is NULL
