CREATE TABLE Enrolled
      sid CHAR(20),
      cid CHAR(20),
      PRIMARY KEY (eid),
      UNIQUE (sid, cid));
     (eid CHAR(20) NOT NULL, 