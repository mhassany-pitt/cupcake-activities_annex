#include <stdio.h>
#include <stdlib.h>  				/* needed for exit() */
int main()
{
  int i;
  FILE *outFile; 				/* FILE declaration */
  double price[] = {39.25,3.22,1.03}; 		/* a list of prices */

  char *descrip[] = { "Batteries",  "Bulbs", "Fuses"};

  outFile = fopen("prices.dat","w"); 		/* open the file */
  if (outFile == NULL)
  {
    printf("\nFailed to open the file.\n");
    exit(1);
  }
  for(i = 0; i < 3; i++)
    fprintf(outFile,"%-9s %5.2f\n",descrip[i],price[i]); // -9s to left justify (see chapter 9)
  fclose(outFile);
  return 0;
}
}