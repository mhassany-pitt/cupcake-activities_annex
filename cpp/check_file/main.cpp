#include <stdio.h>
#include <stdlib.h>  			     /* needed for exit() */
int main()
{
  FILE *inFile;
  inFile = fopen("inputfile.txt","r");        /* open the file having the */
            		   	                /* external name prices.dat */
  if (inFile == NULL)
  {
    printf("\nThe file was not successfully opened.");
    printf("\nPlease check that the file currently exists.\n");
    exit(1);
  }
  printf("\nThe file has been successfully opened for reading.\n");
  return 0;
}
}