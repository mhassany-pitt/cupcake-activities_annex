SELECT customer_no, borrower.loan_no, amount
     FROM borrower, loan
     WHERE borrower.loan_no = loan.loan_no AND branch_name = 'Perryridge';