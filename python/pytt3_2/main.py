#Program to calculate Capital and Interest

rate1 = 5
threshold = 50
rate2 = 6

capital = float(input("Enter your capital: "))

if capital < threshold:
    interest_rate = rate1
else:
    interest_rate = rate2        
print("Rate for", capital, "is", interest_rate, "%")

annual_interest = capital * interest_rate / 100;
print("Interest is $", annual_interest)
print("New capital is $", capital + annual_interest)