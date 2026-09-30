#include <stdio.h>

int main(  void  )
{  
   double hours, rate, salary;
   printf(  "Enter number of hours worked (  -1 to end  ): "  );
   scanf(  "%lf", &hours  );
   while (  hours != -1.0  ) 
  {  
      printf(  "Enter hourly rate of the worker (  $00.00  ): "  );
      scanf(  "%lf", &rate  );
      if (  hours <= 40  )
         salary = hours * rate;
      else
         salary = 40.00 * rate + (  hours - 40.00  ) * rate * 1.5;

      printf(  "Salary is $%.2lf\n\n", salary  );

      printf(  "Enter number of hours worked (  -1 to end  ): "  );
      scanf(  "%lf", &hours  );
   }
   return 0;
}