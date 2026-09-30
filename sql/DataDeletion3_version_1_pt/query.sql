DELETE FROM account
     WHERE balance < 
         (SELECT AVG(balance)
          FROM account);