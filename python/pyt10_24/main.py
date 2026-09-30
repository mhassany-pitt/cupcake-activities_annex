loop = 1
while loop == 1:
    try:
        a = input('Enter a number to subtract from > ')
        b = input('Enter the number to subtract > ')
        print(int(a) - int(b))
    except NameError:
        print("\nYou cannot subtract a letter")
        continue
    try:
        loop = input('Press 1 to try again > ')
    except NameError:
        loop = 0