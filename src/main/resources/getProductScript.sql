select product_name from orders A inner join customers B on A.customer_id = B.id where lower (name) = :name;