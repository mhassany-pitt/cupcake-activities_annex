#include <stdio.h>
#define NUMELS 5
int findMax(int[], int); /* function prototype */
int main()
{
  int nums[NUMELS] = {2, 18, 1, 27, 16};
  printf("The maximum value is %d\n", findMax(nums,NUMELS));
  return 0;
}
int findMax(int *vals, int numEls) /* find the maximum value */
{
  int i, max = *vals;
  for (i = 1; i < numEls; i++)
    if (max < *(vals + i))
      max = *(vals + i);
  return (max);
}
}