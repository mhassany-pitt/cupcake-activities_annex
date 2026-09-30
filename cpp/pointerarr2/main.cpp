#include <stdio.h>
#define NUMELS 5
int main()
{
  int i;
  int grade[] = {98, 87, 92, 79, 85};

  for (i = 0; i < NUMELS; i++)
    printf("Element %d is %d\n", i, *(grade + i) );

  return 0;
}
}