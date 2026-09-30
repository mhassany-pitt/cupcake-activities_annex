#include <stdio.h>
int main()
{
  int n;
  char *seasons[] = {"Winter", "Spring", "Summer", "Fall"};
  for(n = 0; n < 4; ++n)
    printf("The season is %s\n.",seasons[n]);

  return 0;
}
}