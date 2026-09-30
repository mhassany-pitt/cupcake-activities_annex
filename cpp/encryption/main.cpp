#include <stdio.h>
#include <stdlib.h>
#include <time.h>
//function prototypes
void encrypt(char [], int);
void decrypt(char [], int);
main()
{
char myString[21] = {'\0'};
int iSelection = 0;
int iRand;
srand(time(NULL));
iRand = 1 + rand() % 4; // random #, 1-4

while ( iSelection != 4 ) {
   printf("\n\n1\tEncrypt Clear Text\n");
   printf("2\tDecrypt Cipher Text\n");
   printf("3\tGenerate New Key\n");
   printf("4\tQuit\n");
   printf("\nSelect a Cryptography Option: ");
   scanf("%d", &iSelection);

   switch (iSelection) {
    case 1:
      printf("\nEnter clear text: ");
      scanf("%s", myString);
      encrypt(myString, iRand);
      break;
    case 2:
      printf("\nEnter cipher text: ");
      scanf("%s", myString);
      decrypt(myString, iRand);
      break;
    case 3:
      srand(time(NULL));
      iRand = 1+ rand() % 4; // random #, 1-4
      printf("\nNew Key Generated
");
      break;
   }  //end switch

}  //end loop

}  //end main

void encrypt(char sMessage[], int random)
{
  int x = 0;

  while ( sMessage[x] != '\0' ) {   
     sMessage[x] += random; 
     x++;
} //end loop

  x = 0;
  printf("\nEncrypted Message is: ");
  while ( sMessage[x] != '\0' ) {
    printf("%c", sMessage[x]);
    x++;
} //end loop
}  //end encrypt function

void decrypt(char sMessage[], int random)
{
  int x = 0;
  x = 0;
 while ( sMessage[x] != '\0' ) {
     sMessage[x] = sMessage[x] - random;
     x++;
} //end loop

x = 0;
printf("\nDecrypted Message is: ");
while ( sMessage[x] != '\0' ) {
  printf("%c", sMessage[x]);
  x++;
} //end loop

}  //end decrypt function