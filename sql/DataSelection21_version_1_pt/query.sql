(SELECT customer_name 
     FROM depositor)
     EXCEPT
     (SELECT customer_name
     FROM borrower);