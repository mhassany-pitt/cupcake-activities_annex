CREATE TABLE Enrolled
     (sid CHAR(20) NOT NULL,
      cid CHAR(20) NOT NULL,
      grade CHAR(2),
      PRIMARY KEY (sid,  cid),
      FOREIGN KEY (sid)
      REFERENCES Students
      ON DELETE CASCADE
      ON UPDATE SET DEFAULT);