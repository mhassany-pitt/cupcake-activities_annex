SELECT S.rating 
     FROM Sailor S
     WHERE S.age = 
         (SELECT MIN (AVG(S2.age)) 
          FROM sailors S2);