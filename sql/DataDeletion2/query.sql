DELETE FROM account
     WHERE branch_name IN
         (SELECT branch_name
          FROM branch
          WHERE branch_city = 'Brooklyn');