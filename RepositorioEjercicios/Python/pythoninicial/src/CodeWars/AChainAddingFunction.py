
def add(n):
    def acum(y):
        return add(n+y)
    return n


print(add(1))
print(add(1)(2))
print(add(1)(2)(3))