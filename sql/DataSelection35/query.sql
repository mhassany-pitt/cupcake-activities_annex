CREATE VIEW all_customer AS 
    (SELECT branch_name, customer_name
        FROM depositor, account
        WHERE depositor.account_no = account.account_no)
     UNION
    (SELECT branch_name, customer_name
        FROM borrower, loan
        WHERE borrower.loan_no = loan.loan_no);