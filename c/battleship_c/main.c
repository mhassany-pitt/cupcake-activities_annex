/* Example 15.1: Naval Battle
        Author: Peter Brusilovsky */

#include <stdio.h>
#define FSIZE 5
#define SHIP 1
#define EMPTY 0
#define DESTROYED 2

static int battlefield[FSIZE][FSIZE] = {
 {1, 0, 1, 0, 0}, /* row A */
 {0, 0, 0, 0, 1}, /* row B */
 {0, 0, 1, 0, 0}, /* row C */
 {0, 0, 0, 0, 0}, /* row D */
 {1, 0, 0, 0, 1}, /* row E */ };

int react(char c, int r);

main() {
        int col;
        char ch_row;

        printf("Enter your move like 5 A
");
        printf("Enter 0 X to exit
");
        /* reads and process hits */
        do{
                printf("You move: ");
                scanf("%d %c", &col, &ch_row);

        } while(react(ch_row, col) > 0);
        return 0; }

int react(char r, int col)
{
    int row;
    if (col == 0) {
        printf("Good Bye!
");
        return 0;
    }
                row = r - 'A';
                if(row < 0 || row > 4)
                        printf("Row %c is not possible!
", r);
                else if (col <1 || col >5)
                        printf("Column %d is not possible!
", col);
                else if (battlefield[row][col-1] == SHIP) {
                        printf("Hit!
");
                        battlefield[row][col-1] = DESTROYED;
                } else if (battlefield[row][col-1] == DESTROYED)
                        printf("This ship has been already destroyed!
");
                else
                        printf("Miss...
");
                return 1;
}