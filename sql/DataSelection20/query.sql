(SELECT customer_name
     FROM depositor)
     INTERSECT
(SELECT customer_name 
     FROM borrower);