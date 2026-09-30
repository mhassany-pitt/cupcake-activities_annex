def print_number(n):
    print(n)

the_list = (1, 2, 3, 4, 5)
for i in range(10):
    try:
        print_number(the_list[i])
    except:
        print_number(0)