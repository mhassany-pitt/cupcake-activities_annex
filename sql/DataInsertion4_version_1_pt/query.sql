INSERT INTO depositor
      SELECT customer_name, loan_no
           FROM loan, borrower
           WHERE branch_name ='Perryridge'
              AND loan.accont_no = borrower.account_no;