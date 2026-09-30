#include <stdio.h>
int main()
{
  char *message2 = "this is a string";
  
  printf("\nThe string is %s", message2);
  printf("\n The base address of this string is %p\n", message2);
  
  message2 = "A new message";
  printf("\nThe string is now: %s", message2);
  printf("\n The base address of this string is %p\n", message2);

  return 0;
}
}