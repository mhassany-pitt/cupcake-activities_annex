temperature = 20

if temperature < 0:
    print("It is extremely cold")
elif temperature >= 0 and temperature < 20:
    print("It is very cold")
elif temperature >= 20 and temperature < 30:
    print("It is just about fine")
else:
    print("It is unpleasant")