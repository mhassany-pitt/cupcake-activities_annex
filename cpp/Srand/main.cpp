#include <stdio.h>
#include <stdlib.h>
main()
{
unsigned seed;
int iRandomNum = 0;
printf("Enter seed: ");
scanf("%u", &seed);
srand(seed);
iRandomNum = (rand() % 4) + 1;
printf("\nFortune Cookie \n");
switch (iRandomNum) {
   case 1:
      printf("\nYou will meet a new friend today.\n");
      break;
   case 2:
      printf("\nYou will enjoy a long and happy life.\n");
      break;
   case 3:
      printf("\nOpportunity knocks softly. Can you hear it?\n");
      break;
   case 4:
      printf("
You'll be financially rewarded for your good deeds.
");
      break;
} //end switch
printf("\nLucky lotto numbers: ");
printf("%d ", (rand() % 49) + 1);
printf("%d ", (rand() % 49) + 1);
printf("%d ", (rand() % 49) + 1);
printf("%d ", (rand() % 49) + 1);
printf("%d ", (rand() % 49) + 1);
printf("%d\n", (rand() % 49) + 1);
} //end main function