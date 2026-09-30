def happy():
    print("Happy Birthday to you!")

def bday(name):
    happy()
    happy()
    print("Happy Birthday, dear {0}!".format(name))
    happy()

def main():
    bday("Mary")
    bday("Josh")
    bday("Professor Flynn")
main()