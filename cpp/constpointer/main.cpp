#include <stdio.h>
int main()
{
   int x = 5, y;
   const int *const ptr = &x; 
   printf( "%d\n", *ptr );
   *ptr = 7;      //Error
   ptr = &y;     //Error
   return 0;
}
}