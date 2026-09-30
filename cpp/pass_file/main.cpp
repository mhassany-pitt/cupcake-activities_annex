#include <stdio.h>
#define LINELEN 81    
#define NUMLINES 5    
char *file_name = "text.dat"; 
int main(void)
{
  FILE *out_file;
  void in_out(FILE *);
  out_file = fopen(file_name,"w");
  if (out_file == (FILE *) NULL)
  {
    printf("\nFailed to open the file %s\n", file_name);
    return -1;
  }
  in_out(out_file);
  fclose(out_file);
  return 0;
}
void in_out(FILE *fname)   
{
  int count;
  char line[LINELEN];  		/* enough storage for one line of text */
  printf("Please enter five lines of text:\n");
  for (count = 0; count < NUMLINES; count++)
  {
    gets(line);
    fprintf(fname,"%s\n",line);
  }
  return;
}
}