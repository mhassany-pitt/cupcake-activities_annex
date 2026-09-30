f = open("test.txt","w")
f.write("This is the first Line")
f.write("This is the second line")
f.close()

f = open("test.txt","a")
f.write("Yet another line")
f.close()