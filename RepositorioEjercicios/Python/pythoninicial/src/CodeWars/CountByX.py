import time


def count_by(x, n):

    """
    :return {list} una secuencia de números que cuentan por `x` `n` veces.
    """
    inicio = time.time()
    multples = list()
    for i in range (x,n*x+1,x):
        multples.append(i)
    fin = time.time()
    return multples


def count_by2(x, n):
    return [i * x for i in range(1, n + 1)]

def count_by3(x, n):
    """
    :return {list} una secuencia de números que cuentan por `x` `n` veces.
    """
    return list(range(x, n * x + 1, x))


print(count_by(1, 10))
print(count_by(2, 5))
print(count_by(3, 5))
print(count_by(50, 5))
print(count_by(100, 5))


