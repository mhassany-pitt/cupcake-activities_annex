SELECT DISTINCT customer_name 
     FROM borrower
     WHERE customer_name NOT IN 
          (SELECT customer_name 
           FROM depositor);