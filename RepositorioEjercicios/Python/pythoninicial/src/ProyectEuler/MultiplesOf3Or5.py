def Multiples_of_3_or_5(n):
    """
    :return:la suma de todos los múltiplos de 3 o 5 por debajo de n.
    """
    return sum(list(filter(lambda x: x % 5 == 0 or x % 3 == 0, list(range(1, n)))))

print(Multiples_of_3_or_5(1000))

