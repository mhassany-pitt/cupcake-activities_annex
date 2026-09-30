#include <stdio.h>
int cubeByValue( int );   
int main()
{
   int number = 5;
   int answer;
   printf( "The original value of number before function execution is %d", number );
   answer = cubeByValue( number );
   printf( "\nThe value of number after function execution is %d", number);
   printf( "\nThe value of answer is %d\n", answer );
   return 0;
}
int cubeByValue( int n )
{
   return n * n * n;   
}
}