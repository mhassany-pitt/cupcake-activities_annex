CREATE TABLE Enrolled
     (eid CHAR(20) NOT NULL, 
      sid CHAR(20),
      cid CHAR(20),
      PRIMARY KEY (eid),
      UNIQUE (sid, cid));