CREATE ASSERTION smallClub
    CHECK
    ((SELECT COUNT(S.sid) 
     FROM sailor S) + 
    (SELECT COUNT(B.sid) 
     FROM boats B)
      < 100));