f = open("test.txt","r")
print(f.read(1))
print(f.read())
print(f.readline(2))

myList = []
for line in f:
    myList.append(line)
print(myList)

f.close()