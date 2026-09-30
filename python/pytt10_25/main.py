def modify(string1):
    string1 = string1.replace("2", "3")
    return string1

def main():
    outer_string = "I have visited 2 countries."
    print(outer_string)
    modify(outer_string)
    print(outer_string)
    outer_string = modify(outer_string)
    print(outer_string)
main()