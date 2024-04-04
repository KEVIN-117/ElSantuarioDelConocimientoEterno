import math

def fun(n):
    r = math.sqrt(n / math.pi)
    return "%.9f" % (2 * math.pi * r)


n = int(input())