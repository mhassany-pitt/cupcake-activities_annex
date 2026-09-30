CREATE TABLE sailors
   (sid INTEGER,
    sname CHAR(10),
    rating INTEGER,
    age REAL,
    PRIMARY KEY (sid),
    CHECK
    ((SELECT COUNT(S.sid) 
     FROM sailor S) + 
    (SELECT COUNT(B.sid) 
     FROM boats B)
     < 100));