#Let user enter the number between 1 and 20, check if the number is valid, then check if the nunber is even or odd and give the square of the number as output to user
enter_number = int(input("Please enter a number between 1 and 20: "))

if enter_number >= 1:
    if enter_number <= 20:
        print("You have entered a valid number")
        if enter_number % 2 == 0:
            print("Your number is even")
            print(enter_number , 'is completely divisible by 2')
        elif enter_number % 2 == 1:
            print("Your number is odd")
            print(enter_number , 'is not divisible by 2')
    else:
        print("You've entered an invalid number")
else:
    print("You've entered an invalid number")