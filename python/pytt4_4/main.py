#Calculating Interest Over Years

capital = float(input("Startup capital ($$$.cc): "))
interest_rate = float(input("Interest rate in percents (xx.xx): "))
years = int(input("How many years? "))
year = 1

while year <= years:
    interest = capital * interest_rate / 100;
    print("Earned $", interest, "in year", year)
    capital += interest
    year += 1

print("Capital afrer", years, "years in bank is $", capital)