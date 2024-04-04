def generaTeFibo():
    """
    
    :return:Al considerar los términos en la sucesión de Fibonacci cuyos valores no superan los cuatro
            millones, encuentre la suma de los términos de valor par.
    """
    listF = list()
    a = 0
    b = 1
    suma = 0
    while True:
        a = b
        b = suma
        suma = a+b
        if suma < 4000000:
            listF.append(suma)
        else:
            break
    return sum(list(filter(lambda x: x % 2 == 0, listF)))

print(generaTeFibo())