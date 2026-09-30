SELECT customer_name, T.loan_no, S.amount
     FROM borrower AS T, loan AS S
     WHERE T.loan_no = S.loan_no;