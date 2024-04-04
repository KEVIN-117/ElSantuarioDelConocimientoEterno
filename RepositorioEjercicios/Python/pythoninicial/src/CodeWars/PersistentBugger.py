from functools import reduce
from operator import mul


def persistence(n):
    if n < 10:
        return 0
    else:
        aux = 1
        while n > 0:
            aux = n % 10 * aux
            n = n // 10
        return 1 + persistence(aux)


def persistence2(n):
    return 0 if n < 10 else persistence(reduce(mul, [int(i) for i in str(n)], 1)) + 1


persistence = lambda n, c=0: persistence(reduce(lambda x, y: int(x) * int(y), str(n)), c + 1) if n >= 10 else c

print(persistence(39))
print(persistence(999))
print(persistence(4))
print(persistence(25))
