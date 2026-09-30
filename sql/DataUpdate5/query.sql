UPDATE Customers
     SET credit_limit = credit_limit + 5000.00
     WHERE cust_num IN
          (SELECT DISTINCT cust
           FROM orders 
           WHERE amount > 25000.00);