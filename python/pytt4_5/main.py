#Sum and Average using Loops

count = int(input("How many numbers: "))
round = 1
sum = 0

while round <= count:
    number = float(input(">"))
    sum += number
    round += 1

if count > 0:
    print("Sum =", sum, "Average =", sum / count)
else:
    print("Can't calculate average of", count, "numbers")