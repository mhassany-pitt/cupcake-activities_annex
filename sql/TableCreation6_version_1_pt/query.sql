CREATE TABLE Sailors
    (sid INTEGER,
     sname CHAR(10),
     rating INTEGER,
     age REAL,
     PRIMARY KEY (sid),
     CHECK (rating >= 1 AND rating <= 10));