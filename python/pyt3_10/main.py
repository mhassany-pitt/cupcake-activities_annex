number = 6

if number < 10:
    if number % 2 == 0:
        if number % 3 == 0:
            print("The selected number is 6")
        else:
            print("The selected number is not perfectly divisible by 3")
    else:
        print("The selected number is not perfectly divisible by 2")
else:
    print("The number is greater than 10")