dice_score = 5

if dice_score < 6:
    if dice_score == 1:
        print("Your score is 1. Please roll again.")
    elif dice_score == 2:
        print("Your score is 2. Please roll again.")
    elif dice_score == 3:
        print("Your score is 3. Please roll again.")
    elif dice_score == 4:
        print("Your score is 4. Please roll again.")
    else:
        print("Your score is 5. Please roll again.")
elif dice_score == 6:
    print("It is a perfect dice score. Congratulations!")
else:
    print("It is an invalid dice score. The value should be between 1 and 6")