(SELECT customer_name 
     FROM depositor)
     UNION
(SELECT customer_name 
     FROM borrower);