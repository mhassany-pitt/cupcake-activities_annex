/* Example 15.2: Day of Year
        Source: K&R2, p. 111
        Modification: Peter Brusilovsky */


#include <stdio.h>
static char daytab[2][13] = {
 {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
 {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
};

void month_day(int year, int yday, int *pmonth, int *pday);

main()
{
        int year, yday; /* input data */
        int month, mday; /* output data */

        /* reads and process data until 0 is entered */
        do{
                printf("Enter Year and Day (yyyy dd): ");
                scanf("%d %d", &year, &yday);
                if(yday > 0) {
                        month_day(year, yday, &month, &mday);
                        printf("Day %d of %d is simply %d/%d/%d
",
                                yday, year, month, mday, year);
                } else
                        printf("Good Bye!
");
        } while(yday > 0);
        return 0;
}

void month_day(int year, int yearday, int *pmonth, int *pday)
{
        int i, leap /* 1 for leap year, 0 for non-leap */;

        leap = ((year%4 == 0) && year%100 != 0) || year%400 == 0;
        for(i = 1; yearday > daytab[leap][i]; i++)
                yearday -= daytab[leap][i];
        *pmonth = i;
        *pday = yearday ;
}