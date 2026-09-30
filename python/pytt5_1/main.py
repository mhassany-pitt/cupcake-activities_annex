def main():
    kids = int(input("How many kids? "))
    apples = int(input("How many apples? "))
    rounds = 0
    while apples >= kids:
        apples -= kids
        rounds += 1
    print(apples, "apples left after round", rounds)
    print("Each kid got {0} apples.".format(rounds))
    print("{0} apples left.".format(apples))