/*  Example: Encrypting machine
    Author: Peter Brusilovsky
*/

#include <stdio.h>
#define SHIFT 1
#define NLCHARS ('z'-'a'+1) /* 26 */
#define NUCHARS ('Z'-'A'+1) /* 26 */

main () {
    int ch, charnum;

    while((ch = getchar()) != EOF)
        if(ch >= 'a' && ch <= 'z') {
            charnum = ch - 'a'; /* a => 0, b => 1... z => 25  */
            putchar('a' + (charnum + SHIFT) % NLCHARS);
        } else if (ch >= 'A' && ch <= 'Z') {
            charnum = ch - 'A'; /* A => 0, B => 1... Z => 25 */
            putchar('A' + (charnum + SHIFT) % NUCHARS);
        } else
            putchar(ch);
}