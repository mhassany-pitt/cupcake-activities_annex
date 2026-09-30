def index_string (test_string, symbol_string):
    for i in range (len (test_string)):
        if test_string [i] == symbol_string:
            return i
    return -1
    
print(index_string('abcd','c'))