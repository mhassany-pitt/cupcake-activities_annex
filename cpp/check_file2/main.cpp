#include <stdio.h>
#include <stdlib.h>      		/* needed for exit() */

int main()
{
  FILE *inFile;
  char fileName[13];

  printf("\nEnter a file name: ");
  gets(fileName);
  inFile = fopen(fileName,"r"); 	/* open the file */
  if (inFile == NULL)
  {
    printf("\nThe file %s was not successfully opened.", fileName);
    printf("\nPlease check that the file currently exists.\n");
    exit(1);
  }
  printf("\nThe file has been successfully opened for reading.\n");

  return 0;
}
}