#Sentinel Loop Control

print("Enter temperature observations, -300 to stop")
count = 0
sum = 0.0

temp = float(input("First temperature: "))
while temp > -300.0:
    sum += temp
    count += 1
    temp = float(input("Next temperature: "))

if count > 0:
    print("Average temperature =", sum / count)
else:
    print("No valid data entered")