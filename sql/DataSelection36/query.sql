SELECT b.bid, COUNT(*) AS account
     FROM boats B, reserves R
     WHERE R.bid = B.bid AND b.color = red
     GROUP BY B.bid;