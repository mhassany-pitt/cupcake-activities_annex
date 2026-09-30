def which_item(tlist, value):
    for i in range (len (tlist)):
        if tlist [i] == value:
            return i
    return -1

print(which_item([1,2,3,4,5],3))