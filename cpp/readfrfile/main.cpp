#include <stdio.h>
#include <stdlib.h>  /* needed for exit() */
int main()
{
  char descrip[10];
  double price;
  FILE *inFile;
  inFile = fopen("prices.dat","r");
  if (inFile == NULL)
  {
    printf("\nFailed to open the file.\n");
    exit(1);
  }
  while (fscanf(inFile, "%s %lf",descrip,&price) != EOF)
    printf("%-9s %5.2f\n",descrip,price);
  fclose(inFile);
  return 0;
}
}