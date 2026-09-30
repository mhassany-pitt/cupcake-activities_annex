SELECT branch_name 
     FROM account
     GROUP BY branch_name
     HAVING AVG(balance) >= ALL 
          (SELECT AVG(balance) 
           FROM account 
           GROUP BY branch_name);