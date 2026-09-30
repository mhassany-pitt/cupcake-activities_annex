#include <stdio.h>

int larger_one(int, int);

void main()
{
   int num1, num2, num3;
   puts("Enter two different integer values: ");
   scanf("%d%d",&num1, &num2);
   num3=larger_one(num1, num2);
   printf("\nThe larger value is %d. \n",num3);
}
int larger_one(int n1, int n2)
{
   if (n1 > n2)
      return n1;
   else
      return n2;
}