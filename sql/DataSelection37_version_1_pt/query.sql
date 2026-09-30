SELECT S.rating, MIN (S.age)
     FROM Sailor S
     WHERE S.age > 18
     GROUP BY S.rating
     HAVING 1 < 
         (SELECT COUNT(*) 
          FROM Sailors S2
          WHERE S.rating = S2.rating);