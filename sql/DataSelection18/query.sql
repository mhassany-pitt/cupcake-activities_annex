SELECT DISTINCT customer_name 
     FROM borrower AS T, loan AS S
     WHERE T.loan_no = S.loan_no
     ORDER BY customer_name;