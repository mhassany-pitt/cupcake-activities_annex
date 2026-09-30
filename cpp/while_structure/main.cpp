/* Program using the while loop */
#include <stdio.h>
int main()
{
   int keepCounter, score, totalGrades, averageGrade;
   totalGrades = 0;
   keepCounter = 1;

   while ( keepCounter <= 5 ) {
      printf( "Enter a score: " );
      scanf( "%d", &score );
      totalGrades = totalGrades + score;
      keepCounter = keepCounter + 1; 
   }
   averageGrade = totalGrades / 5;
   printf( "The Class average is %d\n", averageGrade );
   return 0;
}