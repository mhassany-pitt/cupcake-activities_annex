def str_to_int(var):
   try:
      return int(var)
   except ValueError:
      print("The argument does not contain numbers")

str_to_int("xyz")