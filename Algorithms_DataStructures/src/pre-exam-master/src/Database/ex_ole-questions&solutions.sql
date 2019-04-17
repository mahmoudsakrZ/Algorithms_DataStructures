#1# select customers who have not purchase_order 

-- SELECT * FROM CUSTOMER where customer.customer_id  not in (select customer_id FROM ex_ole.purchase_order);

-- select * from  customer where not exists (select * from purchase_order where customer.customer_id = purchase_order.customer_id);

#2# customer whose birthdate defiened

--  select customer.id from customer where birthdate IS NOT NULL


#3# Select customer lastname and firstname who have the most purchased orders.


-- select count(purchase_order.customer_id) as 'order numbers' , firstname , lastname from customer join purchase_order on customer.customer_id = purchase_order.customer_id
-- group by purchase_order.customer_id order by count(purchase_order.customer_id) desc limit 1;


-- SELECT
--     firstname , lastname
-- FROM
--     customer
-- WHERE
--     customer.customer_id = (SELECT
--             purchase_order.customer_id
--         FROM
--             purchase_order
--         GROUP BY purchase_order.customer_id
-- 		ORDER BY count(purchase_order.customer_id) desc
--         limit 1
--         );

## Another Solution

/*
SELECT * FROM customer
WHERE
    customer.customer_id = (SELECT 
            purchase_order.customer_id
        FROM
            purchase_order
		group by purchase_order
        ORDER BY COUNT(purchase_order.customer_id) desc
        LIMIT 1); 
        
*/

/*
	select * , count(customer_id) as count from purchase_order
    group by purchase_order.customer_id order by count(customer_id) desc limit 1; 
*/


#4# select destinct city order alphabatic

/*
select distinct city from customer order by city;
*/

#5# query the product count per category name

/*
select  p.name , pc.name as 'product category name' , count( p.product_id ) as 'count' 
	   from product_category pc left join product p on pc.product_category_id = p.product_category_id
	   group by p.product_category_id;
*/


#6# query the list number of customers per city

/*
	select city , count(customer_id) as 'count' from customer group by city order by count(customer_id) desc; 
*/

#7# query only the customers having purchased at least one product in books and garden order asc

/*
select distinct c.* from customer c join purchase_order po on c.customer_id = po.customer_id
				join  order_product op on po.order_id = op.order_id 
                join  product p on p.product_id = op.product_id 
                join product_category pc on pc.product_category_id = p.product_category_id where pc.name in ( 'food' , 'drinks' );
*/

#8# select only the product having the heighest available stock

/*
SELECT * FROM product order by product.available_stock desc limit 1;
*/

#9# select the number of purchase order per customer lastname

/*
select customer.* , count(purchase_order.order_id) as 'number of purchase order' from customer join purchase_order on customer.customer_id = purchase_order.customer_id  
		group by purchase_order.customer_id; 
*/

#10# select number of products per category name with 2 or more

select count(*) as 'count'  , product_category.name from product join product_category
on product.product_category_id = product_category.product_category_id 
group by product.product_category_id having count(*) >= 2;


#11# select only the customer not have purchase order

select * from customer where customer.customer_id NOT IN ( select purchase_order.customer_id from purchase_order );


#12# list the customer who has the purchase order =75000 or 34000 and birth_date not null

select customer.* from customer join purchase_order on customer.customer_id = purchase_order.customer_id 
join order_product on order_product.order_id = purchase_order.order_id
join product on product.product_id = order_product.product_id where product.price IN (75000 , 34000) and customer.birth_date not null; 


#13# Select customer lastname and firstname who have the most purchased orders


#14# select fname last name whose last name start with w


#15# list all data where Category name = Books or = Garden 


#16# query product price > 100

/*  

left join 

	select a.name as product_name , b.name as category_name
	from product a left join product_category b on
	a.product_category_id = b.product_category_id 
*/



/*

-------------------------------------------------------------------------------------------------------------------------------
*******************************************************************************************************************************
-------------------------------------------------------------------------------------------------------------------------------
	*SQL#	-SQL-	#SQL*	*SQL#	-SQL-	#SQL*	*SQL#	-SQL-	#SQL*	*SQL#	-SQL-	#SQL*	*SQL#	-SQL-	#SQL*
-------------------------------------------------------------------------------------------------------------------------------
*******************************************************************************************************************************
-------------------------------------------------------------------------------------------------------------------------------



-- select destinct city order alphabatic

select disyinct city
from customer
order by city asc     

-----------------------------------------

-- query the product count per category name

select a.name as category_name , count(b.product_id) as product_count
from product_category a join product b 
on 
a.product_category_id = b.product_category_id
group by a.name

-----------------------------------------

-- query the list number of customers per city

select city , count(*) as customer_count
from customer
group by city
having customer_count >= 2

-----------------------------------------

-- query only the customers having purchased at least one product in books and garden order asc
 
select distinct a.customer_id

from purchase_order a , order_product b , product c , product_category d

where a.order_id = b.order_id and
b.product_id = c.product_id and
c.product_category_id = d.product_category_id 
and
(d.name = 'Books' or d.name = 'Garden')
 
order by a.customer_id

-----------------------------------------

-- select only the product having the heighest available stock

select product_id , name , available_stock  as heighest_available_stock
from product 
where available_stock in (
	select max(available_stock)
	from product
)

-----------------------------------------

-- select the number of purchase order per customer lastname

select a.lastname , count(b.customer_id) as purchase_order_count
from customer a join purchase_order b
on a.customer_id = b.customer_id
group by a.lastname
having purchase_order_count >= 2

-----------------------------------------

-- select number of products per category name with 2 or more

select a.name as category_name , count(b.product_id) as product_count
from product_category a 
join product b on a.product_category_id = b.product_category_id
group by a.name
having product_count >= 2

-----------------------------------------

-- select only the customer not have purchase order

select customer_id , firstname , lastname
from customer
where customer_id not in (
	select distinct customer_id
	from purchase_order 
)

-----------------------------------------

-- list the customer who has the purchase order =75000 or 34000 and birth_date not null

select customer_id , firstname , lastname , zipcode
from customer
where (zipcode = '75000' or zipcode = '34000') and birth_date is not null
  
-----------------------------------------

-- Select customer lastname and firstname who have the most purchased orders

select lastname , firstname
from customer
where customer_id in (

select a.customer_id
from customer a join purchase_order b on
a.customer_id = b.customer_id 
group by a.customer_id
order by count(b.customer_id) desc
limit 1
)

-----------------------------------------

-- select fname last name whose last name start with w

select firstname , lastname
from customer
where lastname like 'W%'
order by firstname

-----------------------------------------

-- list all data where Category name = Books or = Garden 

select a.firstname , a.lastname , d.name as product_name , e.name as category_name
from customer a , purchase_order b , order_product c , product d , product_category e
where a.customer_id = b.customer_id and
b.order_id = c.order_id and
c.product_id = d.product_id and
d.product_category_id = e.product_category_id and
(e.name = 'Books' or e.name = 'Garden')
order by a.firstname , a.lastname , d.name , e.name
	
----------------------------------------

-- query product price > 100

select product_id , name , price

from product

where price > 100

order by price desc , product_id
----------------------------------------

-- left join 

select a.name as product_name , b.name as category_name
from product a left join product_category b on
a.product_category_id = b.product_category_id 

-------------------------------------


-- customers per city
select city,COUNT(`customer_id`) as CUSTOMER_COUNT 
from customer 
group by city 
HAVING customers >= 2;

-- number of products per category
select product_category.name as CATEGORY_NAME,count(product.product_id) as PRODUCT_COUNT from product_category left join product on product.product_category_id = product_category.product_category_id group by product_category.name;

-- customers with no orders
select customer.firstname from customer where customer.customer_id not in (select customer_id from purchase_order)
select customer.firstname from customer left join purchase_order on customer.customer_id = purchase_order.customer_id where purchase_order.order_id is null;

-- with zip code
select firstname,lastname 
from customer 
where zipcode in ( 34000,75000) and birth_date is not null;

-- highest avaiable stock
select product.product_id,product.name 
from product 
where product.avaliable_stock = (SELECT max(avaliable_stock) FROM `product` )

-- number of orders per customers
select customer.lastname as CUSTOMER_LASTNAME,COUNT(purchase_order.order_id) as PURCHASE_COUNT 
from customer inner join purchase_order on purchase_order.customer_id = customer.customer_id 
group by customer.customer_id having PURCHASE_COUNT > 2;

-- customer purchased from category
select distinct customer.customer_id from customer
inner join purchase_order on purchase_order.customer_id = customer.customer_id
inner join order_product on order_product.order_id = purchase_order.order_id
inner join product on product.product_id = order_product.product_id
inner join product_category on product_category.product_category_id = product.product_category_id
where product_category.name = 'Books' or product_category.name = 'Garden'
order by customer.customer_id asc;

-- Select customer lastname and firstname who have the most purchased orders
select customer.firstname,customer.lastname 
from customer 
where customer.customer_id = 
(SELECT customer_id FROM `purchase_order` 
group by customer_id 
order by count(order_id) limit 1)


-- Customers.sql file
select customer.firstname 
from customer 
JOIN purchase_order on customer.customer_id = purchase_order.customer_id 
JOIN order_product on order_product.order_id = purchase_order.order_id 
JOIN product on product.product_id = order_product.order_id 
JOIN product_category on product_category.product_category_id = product.product_category_id 
WHERE product_category.name = "Cars" HAVING COUNT(product.product_id) > 2;

-- inner_all.sql file
select customer.firstname,product.name as product_name,product_category.name as product_category from purchase_order 
INNER JOIN order_product on purchase_order.order_id = order_product.order_id 
INNER JOIN product on product.product_id = order_product.product_id 
INNER JOIN customer on customer.customer_id = purchase_order.customer_id 
INNER JOIN product_category on product_category.product_category_id = product.product_category_id;



*/



