SELECT branch_name 
     FROM branch
     WHERE assets > ALL
          (SELECT assets 
           WHERE branch_city = Brooklyn);