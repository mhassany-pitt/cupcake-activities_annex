SELECT temp.rating, temp.average
     FROM 
        (SELECT S.rating, AVG(S.age) AS avgage
         FROM sailors S
         GROUP BY S.rating) AS temp
     WHERE temp.avgage = 
    (SELECT MIN(temp.avgage) 
     FROM temp);