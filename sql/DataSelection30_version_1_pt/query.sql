SELECT branch_name 
     FROM branch
     WHERE assets > SOME
          (SELECT assets 
           FROM branch 
          WHERE branch_city = 'Brooklyn');