SELECT S.name, E.cid 
      FROM Student S, Enrolled E
      WHERE S.sid = E.sid AND E.grade = "A";