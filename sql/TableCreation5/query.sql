CREATE TABLE Reserves
    (sname CHAR(10),
     bid INTEGER,
     day DATE,
     PRIMARY KEY(bid, day),
     CONSTRAINT noInterlakeRes
     CHECK
      ('Interlake' <>
             (SELECT B.bname
              FROM boats B
              WHERE B.bid = bid)));