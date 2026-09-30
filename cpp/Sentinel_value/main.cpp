/* sentinel value to control the loop/repetition */
#include <stdio.h>
int main()
{
   float averageScore;              
   int keepCounter, score, totalScore;
   
   totalScore = 0;
   keepCounter = 0;
   
   printf( "Enter a score, -9 to end: " );
   scanf( "%d", &score );
   while ( score != -9 ) {
      totalScore = totalScore + score;
      keepCounter = keepCounter + 1; 
      printf( "Enter a score, -9 to end: " );
      scanf("%d", &score);
   }
   if ( keepCounter != 0 ) {
      averageScore = ( float ) totalScore / keepCounter;
      printf( "Class average is %.2f\n", averageScore );
   }
   else
      printf( "No grades were entered\n" );
   return 0;  
}