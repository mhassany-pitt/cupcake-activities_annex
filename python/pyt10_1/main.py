#Calculating Weekly Wages of the employees

totalHours = 45
hourlyWage = 20

if totalHours <= 40:
    totalWages = hourlyWage*totalHours
else:
    overtime = totalHours - 40
    totalWages = hourlyWage*40 + (1.5*hourlyWage)*overtime
print(totalWages)