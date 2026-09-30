UPDATE Students S
     SET S.gpa = S.gpa*1.01
     WHERE S.gpa >= 3.3;