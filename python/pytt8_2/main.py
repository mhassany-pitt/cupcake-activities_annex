def main ():
    mystring = input ("Enter string to search?")
    mysym = input ("Enter symbold to search for?")
    if mysym in mystring:
        print(mystring.index(mysym))
    else:
        print(mysym + " not in " + mystring)
        
main()