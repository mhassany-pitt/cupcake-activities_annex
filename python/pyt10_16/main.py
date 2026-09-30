class calculator(object):
    def __init__ (self):
        self.current = 0
    def add(self, amount):
        self.current += amount
        return self.current
    def subtract(self, amount):
        self.current -= amount
        return self.current
    def getCurrent(self):
        return self.current

a = calculator()
print(a.add(5))
print(a.subtract(2))