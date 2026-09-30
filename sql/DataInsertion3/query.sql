INSERT INTO account
      SELECT loan_no, branch_name, 200
          FROM loan
          WHERE branch_name = 'Perryridge';