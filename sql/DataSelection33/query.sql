SELECT branch_name, avg_balance
     FROM
          (SELECT branch_name, AVG(balance)
           FROM account
           GROUP BY branch_name)
           AS branch_avg(branch_name, avg_balance))
    WHERE avg_balance > 1200;