SELECT branch_name, AVG(balance)
     FROM account
     GROUP BY branch_name
     HAVING AVG(balance) > 600;