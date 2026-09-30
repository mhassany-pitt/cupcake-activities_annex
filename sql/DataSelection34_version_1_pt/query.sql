CREATE VIEW v AS 
     (SELECT customer_name, loan_no 
      FROM borrower, loan
      WHERE borrower.loan_no = loan.loan_no);