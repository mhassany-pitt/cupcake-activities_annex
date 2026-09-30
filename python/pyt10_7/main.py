def attendance(number):
    if number == 0:
        print("None of the Student came for the lecture")
    elif number < 0:
        print("Invalid number")
    else:
        if number > 100:
            print("Out of range")
        elif number >70:
            print("High Attendance")
        else:
            print("Low Attendance")

attendance(-1)
attendance(20)
attendance(80)
attendance(1000)